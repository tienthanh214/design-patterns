package Behavioral.Strategy;

public class GunWeapon implements Weapon {
    @Override
    public void useWeapon() {
        System.out.println("This is a gun. Bang Bang Bang!!!");
    }
}
