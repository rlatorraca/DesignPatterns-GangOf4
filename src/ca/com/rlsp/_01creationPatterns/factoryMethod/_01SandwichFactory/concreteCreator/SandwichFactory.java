package ca.com.rlsp._01creationPatterns.factoryMethod._01SandwichFactory.concreteCreator;

import ca.com.rlsp._01creationPatterns.factoryMethod._01SandwichFactory.concreteProduct.BigSandwich;
import ca.com.rlsp._01creationPatterns.factoryMethod._01SandwichFactory.concreteProduct.ChickenSandwich;
import ca.com.rlsp._01creationPatterns.factoryMethod._01SandwichFactory.concreteProduct.LobsterSandwich;
import ca.com.rlsp._01creationPatterns.factoryMethod._01SandwichFactory.creator.SandwichCreatorFactory;
import ca.com.rlsp._01creationPatterns.factoryMethod._01SandwichFactory.product.Sandwich;

/**
 * CONCRETE CREATORS sobrescrevem o método fábrica base para retornar um tipo diferente de produto.
 *
 * Observe que o método fábrica não precisa criar novas instâncias o toda hora.
 * Ele também pode retornar objetos existentes de um cache, um conjunto de objetos, ou outra fonte.
 */
public class SandwichFactory extends SandwichCreatorFactory {

    @Override
    public Sandwich createSandwich(String type) {
        Sandwich sandwich;

        switch (type.toLowerCase()) {
            case "big" -> sandwich = new BigSandwich();
            case "chicken" -> sandwich = new ChickenSandwich();
            case "lobster" -> sandwich = new LobsterSandwich();
            default ->  throw new IllegalArgumentException("No such sandwich.");
        }

        sandwich.addIngredients();
        sandwich.bakeSandwich();
        return sandwich;
    }
}
