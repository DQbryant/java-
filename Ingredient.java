package milkTea;

import java.util.Calendar;

/**
 *
 */
public abstract class Ingredient {
    protected String name;          //名字
    protected Calendar calendar;    //生产日期
    protected int q_day;            //保质期
    public Ingredient() {
    }
    public Ingredient(String name,Calendar calendar, int q_day) {
        this.name = name;
        this.calendar = calendar;
        this.q_day = q_day;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "配料名："+name+",生产日期："+calendar.get(Calendar.YEAR)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"+calendar.get(Calendar.DAY_OF_MONTH)+",保质期："+q_day+" 天";
    }

}
