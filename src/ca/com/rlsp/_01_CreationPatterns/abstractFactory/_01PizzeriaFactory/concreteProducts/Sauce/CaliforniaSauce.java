package ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.concreteProducts.Sauce;

import ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.abstractProducts.Sauce;

public class CaliforniaSauce implements Sauce {

    public CaliforniaSauce(){
        pourSauce();
    }

    @Override
    public void pourSauce() {
        System.out.println("Pouring California Sauce...");
    }
}
