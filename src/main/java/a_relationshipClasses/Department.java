package a_relationshipClasses;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Dyvak on 25.12.2016.
 */
public class Department implements Unit{

    private String name;
    private Set employees = new HashSet();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public int getPersonCount() {
        return getEmployees().size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmployee(Employee newEmployee) {
        employees.add(newEmployee);
        newEmployee.setDepartment(this);
    }

    public Set getEmployees() {
        return employees;
    }

    public void removeEmployee(Employee e) {
        employees.remove(e);
    }
}
