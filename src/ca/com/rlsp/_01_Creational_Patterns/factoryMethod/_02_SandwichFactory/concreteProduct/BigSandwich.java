package ca.com.rlsp._01_Creational_Patterns.factoryMethod._02_SandwichFactory.concreteProduct;

import ca.com.rlsp._01_Creational_Patterns.factoryMethod._02_SandwichFactory.product.Sandwich;

/**
 * CONCRETE PRODUCTS são implementações diferentes da interface do produto.
 */
public class BigSandwich extends Sandwich {

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for BigSandwich.");
    }
}
