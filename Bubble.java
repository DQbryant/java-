package milkTea;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 */
public class Bubble extends Ingredient {
    public Bubble(String name, Calendar calendar) {
        super(name, calendar, 7);
    }
    public boolean isOverdue(){
        Calendar c = Calendar.getInstance();
        c.setTime(new Date(System.currentTimeMillis()-q_day*24*3600*1000));
        return calendar.before(c);
    }
    @Override
    public String toString() {
        return "种类：珍珠，"+super.toString();
    }
}
