package ca.com.rlsp._01_CreationPatterns.factoryMethod._01SandwichFactory.concreteProduct;

import ca.com.rlsp._01_CreationPatterns.factoryMethod._01SandwichFactory.product.Sandwich;

/**
 * CONCRETE PRODUCTS são implementações diferentes da interface do produto.
 */
public class ChickenSandwich extends Sandwich {

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for ChickenSandwich.");
    }
}
