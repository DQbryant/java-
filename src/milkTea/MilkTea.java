package milkTea;

/**
 *
 */
public class MilkTea {
    private String name;
    private Ingredient ingredient = null;

    public MilkTea(String name, Ingredient ingredient) {
        this.name = name;
        this.ingredient = ingredient;
    }

    @Override
    public String toString() {
        return name+"里添加了"+ingredient.getName()+"\n"+ingredient.toString();
    }
}
