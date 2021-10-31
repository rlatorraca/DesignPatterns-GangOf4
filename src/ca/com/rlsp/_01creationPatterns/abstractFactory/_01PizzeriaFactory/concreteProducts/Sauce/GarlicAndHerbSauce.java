package ca.com.rlsp._01creationPatterns.abstractFactory._01PizzeriaFactory.concreteProducts.Sauce;

import ca.com.rlsp._01creationPatterns.abstractFactory._01PizzeriaFactory.abstractProducts.Sauce;

public class GarlicAndHerbSauce implements Sauce {

    public GarlicAndHerbSauce(){
        pourSauce();
    }

    @Override
    public void pourSauce() {
        System.out.println("Pouring Garlic and Herb Sauce...");
    }
}
