package ca.com.rlsp._01creationPatterns.abstractFactory._01PizzeriaFactory.concreteFactory;

import ca.com.rlsp._01creationPatterns.abstractFactory._01PizzeriaFactory.abstractFactory.BaseToppingFactory;
import ca.com.rlsp._01creationPatterns.abstractFactory._01PizzeriaFactory.abstractProducts.Cheese;
import ca.com.rlsp._01creationPatterns.abstractFactory._01PizzeriaFactory.abstractProducts.Sauce;
import ca.com.rlsp._01creationPatterns.abstractFactory._01PizzeriaFactory.concreteProducts.Cheese.MozzarellaCheese;
import ca.com.rlsp._01creationPatterns.abstractFactory._01PizzeriaFactory.concreteProducts.Sauce.TomatoSauce;

public class ItalianTopping extends BaseToppingFactory {
    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce creteSauce() {
        return new TomatoSauce();
    }
}
