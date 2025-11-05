# Java Package2.Bar Demo 🍸

## Description
A simple Java OOP demo using inheritance, polymorphism, and file I/O.
This project is part of the EFREI Java Lab #2.

## Package
**bar_demo** contains:
- `Boisson.java`: superclass with base attributes and methods  
- `Cocktail.java`: subclass that overrides and extends functionality  
- `Package2.BarApp.java`: main entry point of the application  

## Run Instructions
1. Open a terminal in the project folder.
2. Compile the Java files:
   ```bash
   javac src/bar_demo/*.java
   ```
3. Run the program:
   ```bash
   java -cp src bar_demo.Package2.BarApp
   ```

The program will create a file named `bar_output.txt` with sample output.

## Example Output
```
🍸 Welcome to the Java Package2.Bar!
----------------------------
Name: Orange juice
Price: 3.5 €
Alcoholic: No
Name: Mojito
Price: 8.5 €
Alcoholic: Yes
Ingredients: Rum, Mint, Lime, Crushed ice
✅ File 'bar_output.txt' created successfully!
```
