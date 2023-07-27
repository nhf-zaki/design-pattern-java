package patterns.structural.composite;

import java.util.ArrayList;
import java.util.Collection;

public class CompositeDepartment implements Department {
    private Integer id;
    private String name;
    private Collection<Department> childDepartments;

    public CompositeDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        childDepartments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }
}
