package Creational.AbstractFactory;

public class WinLabel implements Label {
    @Override
    public void render() {
        System.out.println("Windows Label created!");
    }
}
