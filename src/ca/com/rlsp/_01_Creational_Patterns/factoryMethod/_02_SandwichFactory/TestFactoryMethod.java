package ca.com.rlsp._01_Creational_Patterns.factoryMethod._02_SandwichFactory;

import ca.com.rlsp._01_Creational_Patterns.factoryMethod._02_SandwichFactory.concreteCreator.SandwichFactory;
import ca.com.rlsp._01_Creational_Patterns.factoryMethod._02_SandwichFactory.creator.SandwichCreatorFactory;
import ca.com.rlsp._01_Creational_Patterns.factoryMethod._02_SandwichFactory.product.Sandwich;

public class TestFactoryMethod {


    public static void main(String... args){
        SandwichCreatorFactory sandwichFactory = new SandwichFactory();
        Sandwich big = sandwichFactory.createSandwich("big");
        Sandwich chicken = sandwichFactory.createSandwich("chicken");
        Sandwich lobster = sandwichFactory.createSandwich("lobster");
    }
}
