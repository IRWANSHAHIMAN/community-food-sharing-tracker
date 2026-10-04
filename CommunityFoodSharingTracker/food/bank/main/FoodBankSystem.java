package food.bank.main;

import food.bank.model.Food;
import food.bank.model.FreshFood;
import food.bank.model.CannedFood;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodBankSystem {
    public static void main(String[] args) {
        // Create Scanner and food list
        Scanner input = new Scanner(System.in);
        ArrayList<Food> foodList = new ArrayList<>();

        int choice = 0;
        // Main menu loop
        do {
            // Display menu
            System.out.println("\n=================================");
            System.out.println(" COMMUNITY FOOD SHARING TRACKER");
            System.out.println("=================================");
            System.out.println("1. Add Food");
            System.out.println("2. View All Food");
            System.out.println("3. Search Food");
            System.out.println("4. Exit");
            System.out.println("=================================");

            try {

                System.out.print("Enter choice: ");
                choice = Integer.parseInt(input.nextLine());

                switch (choice) {
                    // Add new food
                    case 1:
                        System.out.println("\n--- ADD FOOD --");
                        System.out.print("Enter food Id: ");
                        String foodId = input.nextLine().trim().toUpperCase();
                        
                        System.out.print("Enter food Name: ");
                        String name = input.nextLine().trim();
                        
                        try{
                            System.out.print("Enter Quantity: ");
                            int quantity = Integer.parseInt(input.nextLine());
                            
                            System.out.println("1. Fresh Food");
                            System.out.println("2. Canned Food");
                            
                            System.out.print("Select Food Type: ");
                            int type = Integer.parseInt(input.nextLine());
                            // Check food type
                            if(type == 1) {
                                foodList.add(new FreshFood(foodId, name, quantity));
                                System.out.println("Fresh food added successfully.");
                            } else if(type == 2) {
                                foodList.add(new CannedFood(foodId, name, quantity));
                                System.out.println("Canned food added successfully.");
                            } else {
                                System.out.println("Invalid food type.");
                            }
                        } catch(NumberFormatException e) {
                            // Handle invalid quantity or food type
                            System.out.println("Error: Quantity and food type must be numbers.");
                        }
                        break;
                        
                    // View all donated food
                    case 2:
                        System.out.println("\n--- ALL DONATED FOOD ---");
                        if (foodList.isEmpty()) {
                            System.out.println("No food donations available.");
                        } else {
                            // Display food information
                            for (Food food : foodList) {
                    
                                System.out.println("-------------------------");
                                System.out.println("Food ID  : " + food.getFoodId());
                                System.out.println("Name     : " + food.getName());
                                System.out.println("Quantity : " + food.getQuantity());
                                System.out.println("Storage  : " + food.getStorageInstructions());
                            }
                        }
                        break;
                    // Search food by name or ID
                    case 3:
                        System.out.println("\n--- SEARCH FOOD ---");
                        
                        System.out.print("Enter Food Name or ID: ");
                        String search = input.nextLine().trim();
                    
                        boolean found = false;
                        // Search through food list
                        for (Food food : foodList) {
                    
                            if (food.getFoodId().equalsIgnoreCase(search)
                                    || food.getName().equalsIgnoreCase(search)) {
                    
                                System.out.println("\nFood Found!");
                                System.out.println("Food ID  : " + food.getFoodId());
                                System.out.println("Name     : " + food.getName());
                                System.out.println("Quantity : " + food.getQuantity());
                                System.out.println("Storage  : " + food.getStorageInstructions());
                    
                                found = true;
                            }
                        }
                    
                        if (!found) {
                            System.out.println("Food not found.");
                        }
                        break;
                    
                    // Exit system
                    case 4:
                        System.out.println("Thank you for using the system.");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
                
            } catch (NumberFormatException e) {
                 // Handle invalid menu input
                System.out.println("Error: Please enter a number.");
            }

        } while (choice != 4);
        // Close Scanner
        input.close();
    }
}
