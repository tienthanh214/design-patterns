package Creational.FactoryMethod;

/** RoyalBlacksmith (Concrete factory)
 * Manufacture royal weapon
 */

public class RoyalBlacksmith extends Blacksmith {
    @Override
    public Weapon createWeapon(WeaponType type) {
        switch (type) {
            case GUN:
                return new RoyalGun();
            case SWORD:
                return new RoyalSword();
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return "Royal Blacksmith in Kingdom";
    }
}
