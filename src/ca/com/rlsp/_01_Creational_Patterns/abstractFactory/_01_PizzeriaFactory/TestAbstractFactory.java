package ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory;

import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.pizzaFactory.BasePizzaFactory;
import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.pizzaFactory.BelgiumPizza;
import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.pizzaFactory.BrazilianPizza;
import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.pizzaFactory.ItalianPizza;
import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.product.Pizza;

public class TestAbstractFactory {

    public static void main(String[] args) {

        System.out.println("===========================================================");
        System.out.println("======================= BELGIUM ===========================");
        System.out.println("===========================================================");

        BasePizzaFactory pizzaFactory = new BelgiumPizza();
        Pizza cheeseBE = pizzaFactory.createPizza("cheese");
        Pizza calabrezaBE = pizzaFactory.createPizza("calabreza");
        Pizza genovesaBE = pizzaFactory.createPizza("genovesa");

        System.out.println("===========================================================");
        System.out.println("====================== BRAZILIAN ==========================");
        System.out.println("===========================================================");

        pizzaFactory = new BrazilianPizza();
        Pizza cheeseBR = pizzaFactory.createPizza("cheese");
        Pizza calabrezaBR = pizzaFactory.createPizza("calabreza");
        Pizza genovesaBR  = pizzaFactory.createPizza("genovesa");

        System.out.println("===========================================================");
        System.out.println("====================== ITALIAN ============================");
        System.out.println("===========================================================");

        pizzaFactory = new ItalianPizza();
        Pizza cheeseIT = pizzaFactory.createPizza("cheese");
        Pizza calabrezaIT = pizzaFactory.createPizza("calabreza");
        Pizza genovesaIT = pizzaFactory.createPizza("genovesa");

    }
}
