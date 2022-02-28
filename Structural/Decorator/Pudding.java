package Structural.Decorator;

public class Pudding extends CondimentDecorator {
    
    public Pudding(Beverage component) {
        super(component);
    }

    static final double COST = 8000;
    
    @Override
    public double getCost() {
        return COST + super.getCost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + "Pudding";
    }
}
