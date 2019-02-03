package edu.fsu.cs.cen5035;

/**
 * @author ArthVader(Arthur Karapateas)
 */
public class DemonBlade extends BasicWeapon implements Weapon 
{
   public DemonBlade() 
   {
      super(1);            // setting initial Hitpoints to be 1
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
       * The DemonBlade final damage gets a boost double that of the armor
       */
      int damage = DAMAGE + (int) (2.0 * armor);

      //damage cannot be less than 0 for RoleGame
      if(damage < 0) 
      {
         return 0;
      }

      return damage;
   }
   
}
