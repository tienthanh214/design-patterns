package Creational.AbstractFactory;

public class WinButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows Button created!");
    }
}
