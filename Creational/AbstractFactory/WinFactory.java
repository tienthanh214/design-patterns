package Creational.AbstractFactory;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Label createLabel() {
        return new WinLabel();
    }
}
