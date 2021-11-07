package ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.pizzaFactory;

import ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.product.Pizza;

public abstract class BasePizzaFactory {

    public abstract Pizza createPizza(String type);
}
