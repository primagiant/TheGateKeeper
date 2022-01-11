import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthPotion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthPotion extends Potion
{
    public void act()
    {
        super.act();
    }
    
    public void doAction() {
        MyWorld.guardian.health += 2;
    }
}
