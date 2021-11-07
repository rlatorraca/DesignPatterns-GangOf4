package ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.concreteProducts.Cheese;

import ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.abstractProducts.Cheese;

public class GoatCheese implements Cheese {

    public  GoatCheese(){
        addCheese();
    }

    @Override
    public void addCheese() {
        System.out.println("Preparing Goat cheese...");
    }
}
