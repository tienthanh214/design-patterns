package Creational.AbstractFactory;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("MacOS Button created!");
    }
}
