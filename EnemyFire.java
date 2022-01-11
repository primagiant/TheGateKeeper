import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyFire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyFire extends Fire
{
    EnemyFire() 
    {
        this.speed = 5;
    }
    
    EnemyFire(int speed) 
    {
        this.speed = speed;
    }
    
    public void act()
    {
        super.act();
        collisionWithOther();
    }
    
    public void collisionWithOther() 
    {
        if(isTouching(Guardian.class)) {
            MyWorld.guardian.health--;
            getWorld().removeObject(this);
        } else if(isTouching(GuardianFire.class)) {
            removeTouching(GuardianFire.class);
            getWorld().removeObject(this);
        }else {
            super.removeFire();
        }
    }
}
