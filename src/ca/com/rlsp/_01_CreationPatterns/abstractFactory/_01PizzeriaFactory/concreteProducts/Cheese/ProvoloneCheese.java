package ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.concreteProducts.Cheese;

import ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.abstractProducts.Cheese;

public class ProvoloneCheese implements Cheese {

    public  ProvoloneCheese(){
        addCheese();
    }

    @Override
    public void addCheese() {
        System.out.println("Preparing Provolone cheese...");
    }
}
