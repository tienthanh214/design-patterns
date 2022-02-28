package Creational.FactoryMethod;

public class ElfGun implements Weapon {
    @Override
    public void manufacture() {
        System.out.println("Preparing: metal");
        System.out.println("Preparing: silver bullet");
        System.out.println("Hammering for 25 minutes");
        System.out.println("Decorating gun");
    }

    @Override
    public String toString() {
        return "Gun for elves";
    }
}
