package Structural.Decorator;

public class Juice implements Beverage {

    @Override
    public double getCost() {
        return 20000;   // cost of juice maybe 20k vnd :))
    }

    @Override
    public String getDescription() {
        return "Juice";
    }
}
