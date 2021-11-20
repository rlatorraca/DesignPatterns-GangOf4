package ca.com.rlsp._01_Creational_Patterns.factoryMethod._02_SandwichFactory.product;

/**
 * O PRODUCT declara a interface, que é comum a todos os objetos que podem ser produzidos pelo criador e suas subclasses.
 */
public abstract class Sandwich {

    public abstract void addIngredients();

    public void bakeSandwich() {
        System.out.println("Sandwich baked at 375F for 20 minutes.");
    }
}
