import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends Actor
{
    private int frame = 0;
    protected int speed;
    
    Fire() {
        this.speed = 5;
    }
    
    Fire(int speed) {
        this.speed = speed;
    }
    
    public void act()
    {
        move(speed);
        frame++;
    }
    
    protected void removeFire()
    {
        if(isAtEdge() || isTouching(Wall.class)) {
            getWorld().removeObject(this);
        }
    }
}
