/**
 * Factory method
 *  example: blacksmith manufactures weapons
 *      game has many weapons and blacksmiths
 *      a blacksmith can only manufactures some type of weapon
 */

package Creational.FactoryMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Blacksmith blacksmith = new RoyalBlacksmith();
        // test create weapon by royal blacksmith
        Weapon weapon = blacksmith.createWeapon(WeaponType.SWORD);
        System.out.println(blacksmith + " - " + weapon);
        weapon = blacksmith.createWeapon(WeaponType.GUN);
        System.out.println(blacksmith + " - " + weapon);
        // test create weapon by elf blacksmith
        blacksmith = new ElfBlacksmith();
        weapon = blacksmith.createWeapon(WeaponType.SWORD);
        System.out.println(blacksmith + " - " + weapon);
        weapon = blacksmith.createWeapon(WeaponType.GUN);
        System.out.println(blacksmith + " - " + weapon);

        // --------- demo in run-time --------------
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n\n----- Choose your blacksmith -----");
            System.out.println(" 1. Royal Blacksmith");
            System.out.println(" 2. Elf Blacksmith");

            System.out.println("> Press 0 to stop < ");
            int chosen = scanner.nextInt();
            if (chosen == 1) {
                blacksmith = new RoyalBlacksmith();
            } else if (chosen == 2) {
                blacksmith = new ElfBlacksmith();
            } else {
                break;
            }

            System.out.println(blacksmith + ": Please choose your weapon");
            System.out.println("   1. Sword");
            System.out.println("   2. Gun");
            chosen = scanner.nextInt();
            if (chosen == 1) {
                weapon = blacksmith.createWeapon(WeaponType.SWORD);
            } else {
                weapon = blacksmith.createWeapon(WeaponType.GUN);
            }
            System.out.println("You have bought: " + weapon);
        }
        scanner.close();

    }
}