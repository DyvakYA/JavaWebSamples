package a_relationshipClasses;

/**
 * Created by Dyvak on 27.12.2016.
 */
public class Menu {

    private static int i = 0;
    public static void showEmployees (Employee[] employees) {
        System.out.println("Employees list:");
        for (i = 0; i < employees.length; i++) {
            if (employees[i] instanceof Employee) {
                System.out.println(employees[i].getName() + " - " + employees[i].getPosition());
            }
        }
    }
}
