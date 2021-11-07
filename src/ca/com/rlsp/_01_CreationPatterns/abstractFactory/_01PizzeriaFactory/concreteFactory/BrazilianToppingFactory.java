package ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.concreteFactory;

import ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.abstractFactory.BaseToppingAbstractFactory;
import ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.abstractProducts.Cheese;
import ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.abstractProducts.Sauce;
import ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.concreteProducts.Cheese.GoatCheese;
import ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.concreteProducts.Sauce.GarlicAndHerbSauce;

/**
 * CONCRETES FACTORIES implementam métodos de criação fábrica abstratos. Cada fábrica concreta corresponde a uma
 * variante específica de produtos e cria apenas aquelas variantes de produto.
 */
public class BrazilianToppingFactory extends BaseToppingAbstractFactory {
    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Sauce createSauce() {
        return new GarlicAndHerbSauce();
    }
}
