package milkTea;

/**
 *
 */
public interface Shop {
    void addProduction(Ingredient ingredient);
    MilkTea sellMilkTea(String name,String ingredientName) throws SoldOutException;
}
