package Structural.Decorator;

public class MilkFoam extends CondimentDecorator {

    public MilkFoam(Beverage component) {
        super(component);
    }

    static final double COST = 10000;
    @Override
    public double getCost() {
        return COST + super.getCost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + "MilkFoam";
    }
}
