/** abstract decorator for beverage */
package Structural.Decorator;

public abstract class CondimentDecorator implements Beverage {
    private Beverage component;

    public CondimentDecorator(Beverage component) {
        this.component = component;
    }

    public double getCost() {
        return component.getCost();
    }

    public String getDescription() {
        return component.getDescription();
    }
}
