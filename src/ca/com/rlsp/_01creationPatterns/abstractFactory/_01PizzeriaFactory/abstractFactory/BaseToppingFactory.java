package ca.com.rlsp._01creationPatterns.abstractFactory._01PizzeriaFactory.abstractFactory;

import ca.com.rlsp._01creationPatterns.abstractFactory._01PizzeriaFactory.abstractProducts.Cheese;
import ca.com.rlsp._01creationPatterns.abstractFactory._01PizzeriaFactory.abstractProducts.Sauce;


// BaseToppingFactory is providing an “interface to create families of related or dependent objects“.
public abstract class BaseToppingFactory {

    public abstract Cheese createCheese();
    public abstract Sauce creteSauce();
}
