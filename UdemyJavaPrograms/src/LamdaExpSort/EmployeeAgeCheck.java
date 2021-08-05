package LamdaExpSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeAgeCheck {
    public static void main(String[] args) {

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);
        Employee red = new Employee("Red RidingHood", 35);
        Employee charming = new Employee("Prince Charming", 31);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);

        Collections.sort(employees, (Employee employee1, Employee employee2) ->
                employee1.getName().compareTo(employee2.getName()));

        System.out.println("============= Enhanced For Loop ===========");
        System.out.println("********** Employees Over 30: ************");
        for(Employee employee: employees){
            if(employee.getAge() > 30) {
                System.out.println(employee.getName());
            }
        }

        System.out.println("============= Lambda Expression ===========");
        System.out.println("********** Employees Over 30: ************");
        employees.forEach(employee -> {
            if(employee.getAge() > 30) {
                System.out.println(employee.getName());
            }
        });

        System.out.println("********** Employees Below 30: ************");
        employees.forEach(employee -> {
            if(employee.getAge() <= 30) {
                System.out.println(employee.getName());
            }
        });

    }
}
