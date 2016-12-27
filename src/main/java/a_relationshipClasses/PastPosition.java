package a_relationshipClasses;

/**
 * Created by Dyvak on 25.12.2016.
 */
public class PastPosition {

    private String name;
    private Department department;

    public PastPosition(String position, Department dep) {
        name = position;
        department = dep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
