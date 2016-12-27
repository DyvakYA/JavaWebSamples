package a_relationshipClasses;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Dyvak on 25.12.2016.
 */
public class Employee extends Man {

    private String position;
    private IdCard card;
    private Set<Room> room = new HashSet<Room>();
    private Department department;
    private Set<PastPosition> pastPosition = new HashSet<PastPosition>();

    public Employee(String n, String s, String p) {
        name = n;
        surname = s;
        position = p;
    }

    public void setPosition(String position) {
        PastPosition pastPosition = new PastPosition(this.getPosition(), this.getDepartment());
        this.setPastPosition(pastPosition);

        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public IdCard getCard() {
        return card;
    }

    public void setCard(IdCard card) {
        this.card = card;
    }

    public Set getRoom() {
        return room;
    }

    public void setRoom(Room newRoom) {
        room.add(newRoom);
    }

    public void deleteRoom(Room r){
        room.remove(r);
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Set getPastPosition() {
        return pastPosition;
    }

    public void setPastPosition(PastPosition p) {
        pastPosition.add(p);
    }

    public void deletePastPosition(PastPosition p) {
        pastPosition.remove(p);
    }
}
