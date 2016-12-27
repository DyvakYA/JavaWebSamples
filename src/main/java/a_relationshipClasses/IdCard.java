package a_relationshipClasses;

import java.util.Date;

/**
 * Created by Dyvak on 25.12.2016.
 */
public class IdCard {

    private int number;
    private Date dateExpire;

    public IdCard(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDateExpire() {
        return dateExpire;
    }

    public void setDateExpire(Date dateExpire) {
        this.dateExpire = dateExpire;
    }
}
