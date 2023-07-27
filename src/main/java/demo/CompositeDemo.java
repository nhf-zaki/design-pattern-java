package demo;

import patterns.structural.composite.CompositeDepartment;
import patterns.structural.composite.Department;
import patterns.structural.composite.FinancialDepartment;
import patterns.structural.composite.SalesDepartment;

public class CompositeDemo {
    public static void main(String args[]) {
        Department salesDepartment = new SalesDepartment(
                1, "Sales department");
        Department financialDepartment = new FinancialDepartment(
                2, "Financial department");

        CompositeDepartment compositeDepartment = new CompositeDepartment(
                3, "Composite department");

        compositeDepartment.addDepartment(salesDepartment);
        compositeDepartment.addDepartment(financialDepartment);

        compositeDepartment.printDepartmentName();
    }
}
