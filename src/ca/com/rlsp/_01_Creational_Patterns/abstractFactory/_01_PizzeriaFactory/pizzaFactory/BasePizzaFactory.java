package ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.pizzaFactory;

import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.product.Pizza;

public abstract class BasePizzaFactory {

    public abstract Pizza createPizza(String type);
}
