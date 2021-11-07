package ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.pizzaFactory;

import ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.abstractFactory.BaseToppingAbstractFactory;
import ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.concreteFactory.BelgiumToppingFactory;
import ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.product.Pizza;
import ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.product.pizza.CalabrezaPizza;
import ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.product.pizza.CheesePizza;
import ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.product.pizza.GenovesaPizza;

public class BelgiumPizza extends BasePizzaFactory  {


    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;

        BaseToppingAbstractFactory baseToppingAbstractFactory = new BelgiumToppingFactory();
        type = type.toLowerCase();
        switch (type) {
            case "cheese" -> pizza = new CheesePizza(baseToppingAbstractFactory);
            case "calabreza" -> pizza = new CalabrezaPizza(baseToppingAbstractFactory);
            case "genovesa" -> pizza = new GenovesaPizza(baseToppingAbstractFactory);
            default -> throw new IllegalArgumentException("No such pizza.");
        }

        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}