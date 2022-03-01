package Creational.AbstractFactory;

public class MacLabel implements Label {
    @Override
    public void render() {
        System.out.println("MacOS Label created!");
    }
}
