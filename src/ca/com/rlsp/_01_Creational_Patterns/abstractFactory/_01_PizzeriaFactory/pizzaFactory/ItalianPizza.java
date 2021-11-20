package ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.pizzaFactory;

import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.abstractFactory.BaseToppingAbstractFactory;
import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.concreteFactory.ItalianToppingFactory;
import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.product.Pizza;
import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.product.pizza.CalabrezaPizza;
import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.product.pizza.CheesePizza;
import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.product.pizza.GenovesaPizza;

public class ItalianPizza extends BasePizzaFactory  {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        BaseToppingAbstractFactory baseToppingAbstractFactory = new ItalianToppingFactory();
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
