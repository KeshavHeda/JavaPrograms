package StreamsFlatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatmapInstance {

    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 30);
        Employee jane = new Employee("Jane Deer", 25);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);
        Employee red = new Employee("Red RidingHood", 25);

        Department hr = new Department("Human Resources");
        hr.addEmployee(jane);
        hr.addEmployee(jack);
        hr.addEmployee(snow);

        Department accounting = new Department("Accounting");
        accounting.addEmployee(john);
        accounting.addEmployee(red);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);

        System.out.println("******************************************************");
        Map<Integer, List<Employee>> groupedByAge = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(employee -> employee.getAge()));

        for(Integer loopint : groupedByAge.keySet()) {
            groupedByAge.get(loopint).forEach(employee -> {
                System.out.println(loopint + " :: " + employee.getName());
            });
        }

        System.out.println("******************************************************");
        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1, e2) -> (e1.getAge() < e2.getAge()) ? e1 : e2 )
                .ifPresent(System.out::println);

        // not evaluated till there is terminal operation
        System.out.println("******************************************************");
        System.out.println(
        Stream.of("ABC", "AC", "BAA", "CCC", "XY", "ST", "XYZ")
                .filter(s -> {
                    System.out.println(s);
                    return s.length() == 3;
                }).count());


    }
}
