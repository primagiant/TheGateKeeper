import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends Actor
{
    private GreenfootImage fire1 = new GreenfootImage("fire/fire.png");
    private GreenfootImage fire2 = new GreenfootImage("fire/fire2.png");

    private int frame = 0;
    
    public void act()
    {
        fireAnimation();
        move(5);
        removeFire();
        frame++;
    }
    
    private void fireAnimation()
    {
        if(frame % 8 == 0) {
            setImage(fire1);
        } else if (frame % 8 == 4) {
            setImage(fire2);
        }
    }
    
    private void removeFire()
    {
        if(isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
