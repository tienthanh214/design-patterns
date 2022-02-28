package Creational.FactoryMethod;

public class RoyalSword implements Weapon {
    @Override
    public void manufacture() {
        System.out.println("Preparing: wood");
        System.out.println("Preparing: metal");
        System.out.println("Hammering for 10 minutes");
        System.out.println("Decorating sword");
    }

    @Override
    public String toString() {
        return "Royal Sword";
    }
}
