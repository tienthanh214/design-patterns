package Creational.FactoryMethod;

public class ElfSword implements Weapon {
    @Override
    public void manufacture() {
        System.out.println("Preparing: silver");
        System.out.println("Hammering for 15 minutes");
        System.out.println("Decorating sword");
    }

    @Override
    public String toString() {
        return "Sword for elves";
    }
}
