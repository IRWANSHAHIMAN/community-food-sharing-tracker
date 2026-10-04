package food.bank.model;

public abstract class Food {
    private String foodId;
    private String name;
    private int quantity;
    
    public Food(String foodId, String name, int quantity) {
        this.foodId = foodId;
        this.name = name;
        this.quantity = quantity;
    }
    
    public String getFoodId() {
        return foodId;
    }
    
    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public abstract String getStorageInstructions();
}