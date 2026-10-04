package food.bank.model;

public class CannedFood extends Food {
    public CannedFood (String foodId, String name, int quantity) {
        super(foodId, name, quantity);
    }
    
    @Override
    public String getStorageInstructions() {
        return "Store in a cool, dry place";
    }
}