package bar_demo;

import java.io.FileWriter;
import java.io.IOException;

public class BarApp {
    public static void main(String[] args) {
        Boisson.welcome();
        System.out.println("----------------------------");

        Boisson juice = new Boisson("Orange juice", 3.5, false);
        juice.displayInfo();

        String[] ing = {"Rum", "Mint", "Lime", "Crushed ice"};
        Cocktail mojito = new Cocktail("Mojito", 8.5, true, ing);
        mojito.displayInfo();

        Cocktail coke = new Cocktail("Coke", 10.5, true, ing);
        coke.displayInfo();

        try {
            FileWriter writer = new FileWriter("bar_output.txt");
            writer.write("=== Java Package2.Bar Summary ===\n");
            writer.write("Drink 1: " + juice.name + " - " + juice.getPrice() + " €\n");
            writer.write("Drink 2: " + mojito.name + " - " + mojito.getPrice() + " €\n");
            writer.write("Drink 3 : "+ coke.name + " - " + coke.getPrice() + "€\n");
            writer.close();
            System.out.println("✅ File 'bar_output.txt' created successfully!");
        } catch (IOException e) {
            System.out.println("❌ Error writing to file: " + e.getMessage());
        }

        juice.setPrice(-10);
    }
}
