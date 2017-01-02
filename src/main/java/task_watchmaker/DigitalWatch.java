package task_watchmaker;

import java.util.Date;

/**
 * Created by Dyvak on 02.01.2017.
 */
public class DigitalWatch implements Watch {

    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
