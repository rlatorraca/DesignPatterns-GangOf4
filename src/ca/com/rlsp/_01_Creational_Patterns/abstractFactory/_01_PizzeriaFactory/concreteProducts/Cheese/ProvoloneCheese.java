package ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.concreteProducts.Cheese;

import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.abstractProducts.Cheese;

public class ProvoloneCheese implements Cheese {

    public  ProvoloneCheese(){
        addCheese();
    }

    @Override
    public void addCheese() {
        System.out.println("Preparing Provolone cheese...");
    }
}
