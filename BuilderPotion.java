import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShieldPotion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuilderPotion extends Potion
{
     public void act()
    {
        super.act();
    }
    
    public void doAction() {
        MyWorld.portal.maxEnemyEntry += 2;
    }
}
