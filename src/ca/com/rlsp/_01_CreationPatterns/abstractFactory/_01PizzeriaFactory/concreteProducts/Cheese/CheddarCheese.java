package ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.concreteProducts.Cheese;

import ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.abstractProducts.Cheese;

/**
 * CONCRETE PRODUCTS Concretos são várias implementações de produtos abstratos, agrupados por variantes.
 * Cada produto abstrato (cadeira/sofá) deve ser implementado em todas as variantes dadas (Vitoriano/Moderno).
 */
public class CheddarCheese implements Cheese {

    public  CheddarCheese(){
        addCheese();
    }

    @Override
    public void addCheese() {
        System.out.println("Preparing Cheddar cheese...");
    }
}
