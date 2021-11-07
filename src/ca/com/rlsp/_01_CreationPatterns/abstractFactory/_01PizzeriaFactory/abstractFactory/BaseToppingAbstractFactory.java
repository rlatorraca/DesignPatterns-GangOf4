package ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.abstractFactory;

import ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.abstractProducts.Cheese;
import ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.abstractProducts.Sauce;

/**
 * A interface ABSTRACT FACTORY declara um conjunto de métodos para criação de cada um dos produtos abstratos.
 */

// BaseToppingFactory is providing an “interface to create families of related or dependent objects“.
public abstract class BaseToppingAbstractFactory {

    public abstract Cheese createCheese();
    public abstract Sauce createSauce();
}
