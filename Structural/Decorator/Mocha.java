package Structural.Decorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage component) {
        super(component);
    }

    static final double COST = 12000;

    @Override
    public double getCost() {
        return COST + super.getCost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + "Mocha";
    }
}
