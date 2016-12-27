package a_relationshipClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;

/**
 * Created by Dyvak on 25.12.2016.
 */
public class Main {
    public static void main(String[] args) throws ParseException {

        Employee sysEngineer = new Employee("John", "Connor", "System Engineer");
        IdCard card = new IdCard(123);
        card.setDateExpire(new SimpleDateFormat("yyyy-MM-dd").parse("2015-12-31"));
            sysEngineer.setCard(card);
            Room room101 = new Room(101);
            Room room132 = new Room(132);
        sysEngineer.setRoom(room101);
        sysEngineer.setRoom(room132);

        System.out.println(sysEngineer.getName()+ " " + sysEngineer.getPosition());
        System.out.println(new SimpleDateFormat("yyy-MM-dd").format(sysEngineer.getCard().getDateExpire()));
        System.out.println("Rooms");

        Iterator iter = sysEngineer.getRoom().iterator();
        while (iter.hasNext()) {
            System.out.println(((Room) iter.next()).getNumber());
        }

        Department programmersDepartment = new Department("Programmers");
        programmersDepartment.addEmployee(sysEngineer);
        System.out.println(sysEngineer.getDepartment().getName());

        sysEngineer.setPosition("Watcher");

        System.out.println("last work:");
        Iterator iter2 = sysEngineer.getPastPosition().iterator();
        while (iter2.hasNext()) {
            System.out.println(((PastPosition) iter2.next()).getName());
        }

        Employee director = new Employee("Fedor", "Dubov", "Director");
        Menu menu = new Menu();
        Employee employee[] = new Employee[10];
        employee[0] = sysEngineer;
        employee[1] = director;
        Menu.showEmployees(employee);

        System.out.println("in department " + sysEngineer.getDepartment().getName() +
                " work " + sysEngineer.getDepartment().getPersonCount() + " men");
    }
}
