package ca.com.rlsp._01creationPatterns.abstractFactory._01PizzeriaFactory.concreteProducts.Cheese;

import ca.com.rlsp._01creationPatterns.abstractFactory._01PizzeriaFactory.abstractProducts.Cheese;

public class CheddarCheese implements Cheese {

    public  CheddarCheese(){
        addCheese();
    }

    @Override
    public void addCheese() {
        System.out.println("Preparing Cheddar cheese...");
    }
}
