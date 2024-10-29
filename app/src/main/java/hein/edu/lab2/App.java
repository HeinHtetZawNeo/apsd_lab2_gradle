/*
 * This source file was generated by the Gradle 'init' task
 */
package hein.edu.lab2;
import hein.edu.lab2.model.Employee;
import hein.edu.lab2.model.PensionPlan;
import hein.edu.lab2.util.EmployeeUtil;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1L,"Daniel","Agar", LocalDate.of(2018,1,17),105945.50,new PensionPlan("EX1089",LocalDate.of(2023,1,17),100)));
        employees.add(new Employee(2L,"Benard","Shaw", LocalDate.of(2019,4,3),197750.00,null));
        employees.add(new Employee(3L,"Carly","Agar", LocalDate.of(2014,5,16),842000.75,new PensionPlan("EX1089",LocalDate.of(2023,1,17),100)));
        employees.add(new Employee(4L,"Wesley","Schneider", LocalDate.of(2019,10,2),74500.00,null));

        //sort for task
        System.out.println("Task A");
        System.out.println(EmployeeUtil.byJsonFormat(EmployeeUtil.sortForTaskA(employees)));

        System.out.println("Task B");
        System.out.println(EmployeeUtil.byJsonFormat(EmployeeUtil.filterForTaskB(employees)));
    }
}
