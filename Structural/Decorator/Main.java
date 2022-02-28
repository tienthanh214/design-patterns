package Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Beverage stack = new Juice();
        stack = new Mocha(stack);
        stack = new Pudding(stack);
        stack = new MilkFoam(stack);
        System.out.println(stack.getCost());
        System.out.println(stack.getDescription());
        
        Beverage stack2 = new MilkTea();
        stack2 = new Pudding(stack2);
        stack2 = new MilkFoam(stack2);
        stack2 = new Mocha(stack2);
        System.out.println(stack2.getCost());
        System.out.println(stack2.getDescription()); 
    }
}
