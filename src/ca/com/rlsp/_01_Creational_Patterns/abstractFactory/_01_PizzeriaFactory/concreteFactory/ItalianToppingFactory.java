package ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.concreteFactory;

import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.abstractFactory.BaseToppingAbstractFactory;
import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.abstractProducts.Cheese;
import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.abstractProducts.Sauce;
import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.concreteProducts.Cheese.MozzarellaCheese;
import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.concreteProducts.Sauce.TomatoSauce;

/**
 * CONCRETES FACTORIES implementam métodos de criação fábrica abstratos. Cada fábrica concreta corresponde a uma
 * variante específica de produtos e cria apenas aquelas variantes de produto.
 */
public class ItalianToppingFactory extends BaseToppingAbstractFactory {
    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
