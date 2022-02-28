package Creational.FactoryMethod;

public class RoyalGun implements Weapon {
    @Override
    public void manufacture() {
        System.out.println("Preparing: metal");
        System.out.println("Preparing: bullet");
        System.out.println("Hammering for 20 minutes");
        System.out.println("Decorating gun");
    }

    @Override
    public String toString() {
        return "Royal Gun";
    }
}
