package ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.concreteProducts.Sauce;

import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.abstractProducts.Sauce;

public class CaliforniaSauce implements Sauce {

    public CaliforniaSauce(){
        pourSauce();
    }

    @Override
    public void pourSauce() {
        System.out.println("Pouring California Sauce...");
    }
}
