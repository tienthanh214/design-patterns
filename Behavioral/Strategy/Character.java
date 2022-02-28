package Behavioral.Strategy;

public class Character {
    private Weapon weapon;
    public Character() {
        this.weapon = null;
    }
    public Character(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setWeapon(Weapon w) {
        this.weapon = w;
    }
    
    public void attack() {
        weapon.useWeapon();
    }
}
