import java.io.*;
import java.util.ArrayList;

public class BarManager implements Bar {

    // ArrayList to store available drinks
    private ArrayList<String> drinks = new ArrayList<>();

    @Override
    public void addDrink(String drinkName, double price) {
        // Adding drink to the menu list
        drinks.add(drinkName + " - $" + price);
        System.out.println(drinkName + " added to the menu for $" + price);

        // Example of using try/catch with I/O (writing to file)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("drinks.txt", true))) {
            writer.write(drinkName + " - $" + price);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    @Override
    public void serveDrink(String drinkName) {
        // Example of try/catch to handle possible errors
        try {
            if (drinks.isEmpty()) {
                throw new Exception("No drinks available to serve!");
            }
            boolean found = false;
            for (String drink : drinks) {
                if (drink.contains(drinkName)) {
                    System.out.println("Serving " + drinkName + " 🍺");
                    found = true;
                    break;
                }
            }
            if (!found) {
                throw new Exception("Drink not found: " + drinkName);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Extra method: display menu and demonstrate ArrayList
    public void showMenu() {
        System.out.println("\n--- Bar Menu ---");
        for (String d : drinks) {
            System.out.println(d);
        }
    }

    // Demonstrate reading from file
    public void readMenuFromFile() {
        System.out.println("\n--- Reading drinks from file ---");
        try (BufferedReader reader = new BufferedReader(new FileReader("drinks.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
