package Structural.Decorator;

public class MilkTea implements Beverage {

    @Override
    public double getCost() {
        return 15000;
    }

    @Override
    public String getDescription() {
        return "Milk tea";
    }
    
}
