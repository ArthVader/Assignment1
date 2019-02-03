package edu.fsu.cs.cen5035;

/**
 * @author ArthVader(Arthur Karapateas)
 */
//how to generate random numbers in Java found at:
//https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java

public class CrazyRandomSword extends BasicWeapon implements Weapon 
{
   public CrazyRandomSword() 
   {
      super(4 + (int)(Math.random() * ((99 - 4) + 1))); //hitpoints = random integer number between 4 and 99
   }

   @Override
   public int hit() 
   {
      return DAMAGE;
   }
   
   @Override
   public int hit(int armor) 
   {
      /* 
       * Ignores a random amount of integer armor points, ranging from to 3 
       * to a third of the armor the weapon hits.
       */
      int damage_ignored = 3 + (int)(Math.random() * (((armor/3) - 3) + 1));
      int damage = DAMAGE - (int) (1.0 * damage_ignored);
      
      //damage cannot be less than 0 for RoleGame
      if(damage < 0) 
      {
         return 0;
      }

      return damage;
   }
   
}
