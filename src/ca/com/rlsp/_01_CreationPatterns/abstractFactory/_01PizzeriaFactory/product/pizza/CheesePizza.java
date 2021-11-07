package ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.product.pizza;

import ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.abstractFactory.BaseToppingAbstractFactory;
import ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.product.Pizza;

/**
 * Embora fábricas concretas instanciam produtos concretos, assinaturas dos seus métodos de criação devem retornar
 * produtos abstratos correspondentes. Dessa forma o código cliente que usa uma fábrica não fica ligada a variante
 * específica do produto que ele pegou de uma fábrica. O Cliente pode trabalhar com qualquer variante de
 * produto/fábrica concreto, desde que ele se comunique com seus objetos via interfaces abstratas.
 */

public class CheesePizza extends Pizza {

    BaseToppingAbstractFactory toppingFactory;
    public CheesePizza(BaseToppingAbstractFactory toppingFactory){
        this.toppingFactory=toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }

}
