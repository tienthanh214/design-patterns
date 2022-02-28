package Creational.FactoryMethod;

public class ElfBlacksmith extends Blacksmith {
    @Override
    public Weapon createWeapon(WeaponType type) {
        switch (type) {
            case GUN:
                return new ElfGun();
            case SWORD:
                return new ElfSword();
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return "Elf Blacksmith in Forests";
    }
}
