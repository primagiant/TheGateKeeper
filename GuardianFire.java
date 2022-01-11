import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GuardianFire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GuardianFire extends Fire
{
    private GreenfootImage fire1 = new GreenfootImage("fire/fire.png");
    private GreenfootImage fire2 = new GreenfootImage("fire/fire2.png");
    
    private int frame = 0;
    GuardianFire() {
        this.speed = 5;
    }
    
    GuardianFire(int speed) {
        this.speed = speed;
    }
    
    public void act()
    {
        super.act();
        fireAnimation();
        super.removeFire();
    }
    
    protected void fireAnimation()
    {
        if(frame % 8 == 0) {
            setImage(fire1);
        } else if (frame % 8 == 4) {
            setImage(fire2);
        }
    }
}
