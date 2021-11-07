package ca.com.rlsp._01creationPatterns.factoryMethod._01SandwichFactory;

import ca.com.rlsp._01creationPatterns.factoryMethod._01SandwichFactory.concreteCreator.SandwichFactory;
import ca.com.rlsp._01creationPatterns.factoryMethod._01SandwichFactory.creator.SandwichCreatorFactory;
import ca.com.rlsp._01creationPatterns.factoryMethod._01SandwichFactory.product.Sandwich;

public class testFactoryMethod {


    public static void main(String... args){
        SandwichCreatorFactory sandwichFactory = new SandwichFactory();
        Sandwich big = sandwichFactory.createSandwich("big");
        Sandwich chicken = sandwichFactory.createSandwich("chicken");
        Sandwich lobster = sandwichFactory.createSandwich("lobster");
    }
}
