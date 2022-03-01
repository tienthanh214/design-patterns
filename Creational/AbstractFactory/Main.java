package Creational.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        // test MacFactory
        GUIFactory factory = new MacFactory();
        Button button = factory.createButton();
        Label label = factory.createLabel();
        button.render();
        label.render();
        // test WinFactory
        factory = new WinFactory();
        button = factory.createButton();
        label = factory.createLabel();
        button.render();
        label.render();
    }    
}
