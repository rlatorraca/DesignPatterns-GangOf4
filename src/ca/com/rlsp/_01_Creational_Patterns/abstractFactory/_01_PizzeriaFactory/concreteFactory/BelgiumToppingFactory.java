package ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.concreteFactory;

import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.abstractFactory.BaseToppingAbstractFactory;
import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.abstractProducts.Cheese;
import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.abstractProducts.Sauce;
import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.concreteProducts.Cheese.CheddarCheese;
import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.concreteProducts.Sauce.CreamyWhiteSauce;

/**
 * CONCRETES FACTORIES implementam métodos de criação fábrica abstratos. Cada fábrica concreta corresponde a uma
 * variante específica de produtos e cria apenas aquelas variantes de produto.
 */
public class BelgiumToppingFactory extends BaseToppingAbstractFactory {
    @Override
    public Cheese createCheese() {
        return new CheddarCheese();
    }

    @Override
    public Sauce createSauce() {
        return new CreamyWhiteSauce();
    }
}
