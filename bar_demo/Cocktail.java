package bar_demo;

public class Cocktail extends Boisson {
    private String[] ingredients;

    public Cocktail(String name, double price, boolean alcoholic, String[] ingredients) {
        super(name, price, alcoholic);
        this.ingredients = ingredients;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print("Ingredients: ");
        for (int i = 0; i < ingredients.length; i++) {
            System.out.print(ingredients[i]);
            if (i < ingredients.length - 1) System.out.print(", ");
        }
        System.out.println("\n----------------------------");
    }
}
