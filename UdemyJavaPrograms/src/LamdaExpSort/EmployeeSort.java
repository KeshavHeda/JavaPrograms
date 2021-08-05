package LamdaExpSort;

import java.util.*;

public class EmployeeSort {
    public static void main(String[] args) {

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

        Collections.sort(employees, (Employee employee1, Employee employee2) ->
                employee1.getName().compareTo(employee2.getName()));

        System.out.println("********** Loop based on for each ************");

        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });

        System.out.println("********** Loop based on enhanced for and print employee on separate Thread ************");
        for(Employee employee: employees){
            new Thread(() -> {
                System.out.println(employee.getName());
                System.out.println(employee.getAge());
            }).start();
        }
        System.out.println("********** Loop based on increment and print employee on separate Thread ************");

        Employee loneEmployee; // cannot be used in lambda expressions
        for(int loopVar = 0; loopVar < employees.size(); loopVar++) {
            Employee employee = employees.get(loopVar); // variables inside for loop are effectively final
            new Thread(() -> {
                System.out.println(employee.getName());
                System.out.println(employee.getAge());
            }).start();
        }



    }
}
