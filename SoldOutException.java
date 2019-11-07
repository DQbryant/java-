package milkTea;

/**
 *
 */
public class SoldOutException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("你所需要的配料已经售光！请选择其他配料！");
    }
}
