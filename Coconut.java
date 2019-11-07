package milkTea;

import java.util.Calendar;
import java.util.Date;

/**
 *
 */
public class Coconut extends Ingredient {
    public Coconut(String name, Calendar calendar) {
        super(name, calendar,5);
    }
    public boolean isOverdue(){
        Calendar c = Calendar.getInstance();
        c.setTime(new Date(System.currentTimeMillis()-q_day*24*3600*1000));
        return calendar.before(c);
    }

    @Override
    public String toString() {
        return "种类：椰果,"+super.toString();
    }
}
