package edu.fsu.cs.cen5035;

/**
 * @author ArthVader(Arthur Karapateas)
 */
public class SimpleHammer extends BasicWeapon implements Weapon 
{
   public SimpleHammer() 
   {
      super(35);            // setting Hitpoints to be 35
   }

   @Override
   public int hit() 
   {
      return DAMAGE;
   }
   
   @Override
   public int hit(int armor) 
   {
      int damage = 0;
      /* 
       * If the armor is lesser than 30, the hammer will ignore all the armor 
       * points.
       */
      if(armor < 30)
      {
         damage = DAMAGE;
      }
      else
      {
         damage = DAMAGE - (int) (1.0 * armor);
      }

      //damage cannot be less than 0 for RoleGame
      if(damage < 0) 
      {
         return 0;
      }

      return damage;
   }
   
}
