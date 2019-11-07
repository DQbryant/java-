package milkTea;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 *
 */
public class Test {
    public static void main(String[] args) {
        Shop teaShop = new TeaShop();
        Random r = new Random();

        Calendar c1 = Calendar.getInstance();
        c1.setTime(new Date(System.currentTimeMillis()-r.nextInt(15*24*3600*1000)));
        System.out.println(c1.get(Calendar.YEAR)+"-"+(c1.get(Calendar.MONTH)+1)+"-"+c1.get(Calendar.DAY_OF_MONTH));
        teaShop.addProduction(new Bubble("波霸",c1));

        Calendar c2 = Calendar.getInstance();
        c2.setTime(new Date(System.currentTimeMillis()-r.nextInt(7*24*3600*1000)));
        System.out.println(c2.get(Calendar.YEAR)+"-"+(c2.get(Calendar.MONTH)+1)+"-"+c2.get(Calendar.DAY_OF_MONTH));
        teaShop.addProduction(new Coconut("草莓味椰果",c2));
        try {
            MilkTea tea = teaShop.sellMilkTea("奶茶1","Bubble");
            System.out.println(tea.toString());
            tea = teaShop.sellMilkTea("奶茶2","Bubble");
            System.out.println(tea.toString());
        } catch (SoldOutException e) {
            e.printStackTrace();
        }
        try {
            MilkTea tea = teaShop.sellMilkTea("奶茶3","Coconut");
            System.out.println(tea.toString());
            tea = teaShop.sellMilkTea("奶茶4","Coconut");
            System.out.println(tea.toString());
        } catch (SoldOutException e) {
                e.printStackTrace();
        }
    }
}
