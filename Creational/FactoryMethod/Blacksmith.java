package Creational.FactoryMethod;

/** Blacksmith (Creator) */

public abstract class Blacksmith {
    /** factory method
     * factory method create weapon defer instantiation to subclass
     * @param type: weapon type to manufactures
     * @return object with interface Weapon
     */
    abstract public Weapon createWeapon(WeaponType type);
    
    // player want to order a weapon
    Weapon orderWeapon(WeaponType type) {
        Weapon weapon = createWeapon(type);
        weapon.manufacture();
        return weapon;
    }
}
