package ca.com.rlsp._01creationPatterns.abstractFactory._01PizzeriaFactory.concreteProducts.Sauce;

import ca.com.rlsp._01creationPatterns.abstractFactory._01PizzeriaFactory.abstractProducts.Sauce;

public class CreamyWhiteSauce implements Sauce {

    public CreamyWhiteSauce(){
        pourSauce();
    }

    @Override
    public void pourSauce() {
        System.out.println("Pouring Creamy White Sauce...");
    }
}
