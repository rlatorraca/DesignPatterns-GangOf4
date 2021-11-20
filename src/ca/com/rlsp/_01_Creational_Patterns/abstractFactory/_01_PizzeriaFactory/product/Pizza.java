package ca.com.rlsp._01_Creational_Patterns.abstractFactory._01_PizzeriaFactory.product;

public abstract class Pizza {

    public abstract void addIngredients();
    public void bakePizza() {
        System.out.println("Pizza baked at 400 for 20 minutes.");
    }
}
