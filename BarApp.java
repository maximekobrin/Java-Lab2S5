public class BarApp {
    public static void main(String[] args) {
        try {
            BarManager bar = new BarManager();

            // Add drinks
            bar.addDrink("Beer", 5.0);
            bar.addDrink("Whiskey", 12.0);
            bar.addDrink("Mojito", 8.5);

            // Show menu
            bar.showMenu();

            // Serve a drink
            bar.serveDrink("Whiskey");

            // Try serving a drink that doesn't exist
            bar.serveDrink("Vodka");

            // Read from file (I/O demo)
            bar.readMenuFromFile();

        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
