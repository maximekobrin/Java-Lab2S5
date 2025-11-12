package bar_demo;

public class Boisson {
    protected String name;
    private double price;
    public boolean alcoholic;

    public Boisson() {
        this.name = "Unknown drink";
        this.price = 0.0;
        this.alcoholic = false;
    }

    public Boisson(String name, double price, boolean alcoholic) {
        this.name = name;
        this.price = price;
        this.alcoholic = alcoholic;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price + " €");
        System.out.println("Alcoholic: " + (alcoholic ? "Yes" : "No"));
    }

    public static void welcome() {
        System.out.println("🍸 Welcome to the Java Package2.Bar!");
        System.out.println("Enjoy our best drinks!");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Error: price cannot be negative!");
        } else {
            this.price = price;
        }
    }
}
