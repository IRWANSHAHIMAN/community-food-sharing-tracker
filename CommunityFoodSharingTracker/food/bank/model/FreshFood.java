package food.bank.model;

public class FreshFood extends Food {
    public FreshFood(String foodId, String name, int quantity) {
        super(foodId, name, quantity);
    }
    
    @Override
    public String getStorageInstructions() {
        return "Keep Refrigerated at 4°C";
    }
}