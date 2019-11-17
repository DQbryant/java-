package milkTea;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class TeaShop implements Shop {
    private List<Bubble> bubbles;
    private List<Coconut> coconuts;

    public TeaShop() {
        bubbles = new ArrayList<>();
        coconuts = new ArrayList<>();
    }
    private void addIngredient(Bubble bubble){
        bubbles.add(bubble);
    }
    private void addIngredient(Coconut coconut){
        coconuts.add(coconut);
    }


    @Override
    public void addProduction(Ingredient ingredient) {
        if(ingredient instanceof Bubble)addIngredient((Bubble)ingredient);
        else if(ingredient instanceof Coconut)addIngredient((Coconut)ingredient);
    }

    @Override
    public MilkTea sellMilkTea(String name, String ingredientName) throws SoldOutException {
        if(ingredientName.equals("Bubble")){
            List<Bubble> overdueBubbles = new ArrayList<>();
            for(Bubble bubble:bubbles){
                if(!bubble.isOverdue()){
                    MilkTea milkTea = new MilkTea(name,bubble);
                    bubbles.removeAll(overdueBubbles);
                    bubbles.remove(bubble);
                    return milkTea;
                }else overdueBubbles.add(bubble);
            }
            throw new  SoldOutException();
        }else if(ingredientName.equals("Coconut")){
            List<Coconut> overdueCoconuts = new ArrayList<>();
            for(Coconut coconut:coconuts){
                if(!coconut.isOverdue()){
                    MilkTea milkTea = new MilkTea(name,coconut);
                    coconuts.removeAll(overdueCoconuts);
                    coconuts.remove(coconut);
                    return milkTea;
                }else overdueCoconuts.add(coconut);
            }
            throw new  SoldOutException();
        }else return null;
    }
}
