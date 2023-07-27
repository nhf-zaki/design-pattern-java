package demo;

import patterns.structural.adapter.Employee;
import patterns.structural.adapter.EmployeeAdapterView;
import patterns.structural.adapter.EmployeeView;
import patterns.structural.adapter.IEmployee;

import java.util.ArrayList;
import java.util.Collection;

public class AdapterDemo {
    public static void main(String[] args) {
        Collection<IEmployee> employeeList = new ArrayList<>();
        Employee e = new Employee("1", "jkl", "bnm", "jkl@gmail.com");
        employeeList.add(e);

        EmployeeView eView = new EmployeeView("2", "ABC", "DEF", "abc@gmail.com");
        employeeList.add(new EmployeeAdapterView(eView));

        System.out.println(employeeList);
    }
}
