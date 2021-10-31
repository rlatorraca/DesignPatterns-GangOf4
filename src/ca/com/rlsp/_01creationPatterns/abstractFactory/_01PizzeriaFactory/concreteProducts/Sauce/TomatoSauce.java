package ca.com.rlsp._01creationPatterns.abstractFactory._01PizzeriaFactory.concreteProducts.Sauce;

import ca.com.rlsp._01creationPatterns.abstractFactory._01PizzeriaFactory.abstractProducts.Sauce;

public class TomatoSauce implements Sauce {

    public TomatoSauce(){
        pourSauce();
    }

    @Override
    public void pourSauce() {
        System.out.println("Pouring Tomato Sauce...");
    }
}
