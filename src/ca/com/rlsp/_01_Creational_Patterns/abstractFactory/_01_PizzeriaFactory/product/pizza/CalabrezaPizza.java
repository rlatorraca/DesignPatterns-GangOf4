package ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.product.pizza;

import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.abstractFactory.BaseToppingAbstractFactory;
import ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.product.Pizza;

/**
 * Embora fábricas concretas instanciam produtos concretos, assinaturas dos seus métodos de criação devem retornar
 * produtos abstratos correspondentes. Dessa forma o código cliente que usa uma fábrica não fica ligada a variante
 * específica do produto que ele pegou de uma fábrica. O Cliente pode trabalhar com qualquer variante de
 * produto/fábrica concreto, desde que ele se comunique com seus objetos via interfaces abstratas.
 */


public class CalabrezaPizza extends Pizza {

    BaseToppingAbstractFactory toppingFactory;
    public CalabrezaPizza(BaseToppingAbstractFactory toppingFactory){
        this.toppingFactory=toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for calabreza pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }

}
