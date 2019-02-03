package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier and Arthur Karapateas(Additional weapons and 2 test cases)
 */
public class RoleGame {

    public static void main(String[] args) {

        //Testing weapons against a character with no armor, and a character with 29 armor points
        for (int armor = 0; armor <= 29; armor += 29)
    	{
            Weapon weapon = WeaponFactory.getWeapon("sword");
            System.out.println("Sword has " + weapon.hit() + " of damage.");        
            System.out.println("Swords was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");

            weapon = WeaponFactory.getWeapon("spear");
            System.out.println("Spear has " + weapon.hit() + " of damage.");        
            System.out.println("Spear was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");
            
            //Additional weapons added here:
            weapon = WeaponFactory.getWeapon("simpleHammer");
            System.out.println("SimpleHammer has " + weapon.hit() + " of damage.");        
            System.out.println("SimpleHammer was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");

            weapon = WeaponFactory.getWeapon("crazyRandomSword");
            System.out.println("CrazyRandomSword has " + weapon.hit() + " of damage.");        
            System.out.println("CrazyRandomSword was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");

            weapon = WeaponFactory.getWeapon("demonBlade");
            System.out.println("DemonBlade has " + weapon.hit() + " of damage.");        
            System.out.println("DemonBlade was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        }
    }
}
