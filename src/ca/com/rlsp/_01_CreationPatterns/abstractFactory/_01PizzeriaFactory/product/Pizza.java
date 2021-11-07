package ca.com.rlsp._01_CreationPatterns.abstractFactory._01PizzeriaFactory.product;

public abstract class Pizza {

    public abstract void addIngredients();
    public void bakePizza() {
        System.out.println("Pizza baked at 400 for 20 minutes.");
    }
}
