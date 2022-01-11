import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Potion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Potion extends Actor
{
    public void act()
    {
        pickup();
        getImage().scale(10,16);
    }
    
    public void pickup() {
        if(isTouching(Guardian.class)) {
            doAction();
            getWorld().removeObject(this);
        }
    }
    
    public void doAction() {
        
    }
}
