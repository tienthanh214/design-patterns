package Behavioral.Strategy;

public class Main {
    public static void main(String[] args) {
        Character jug = new Character(new GunWeapon());
        jug.attack();
        jug.setWeapon(new SwordWeapon());
        jug.attack();
        jug.setWeapon(new KnifeWeapon());
        jug.attack();
    }
}
