import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{  
    public int health;
    public int speed;
    
    public Enemy() {
        health = 1;
        speed = 1;
    }
    
    public Enemy(int inputHealth, int inputSpeed) {
        health = inputHealth;
        speed = inputSpeed;
    }
    
    public void act()
    {
        moveToTheMiddle();
    }
    
    public void moveToTheMiddle()
    {
        move(speed);
        turnTowards(getWorld().getWidth()/2, getWorld().getHeight()/2);
    }
    
    public void enemyDead(Enemy enemyClass, int inputScore)
    {
        Actor fire = getOneIntersectingObject(Fire.class);
        if(fire != null) {
            health--;
            getWorld().removeObject(fire);
        }
        
        if(health == 0) {
            //getWorld().score += inputScore;
            getWorld().removeObject(enemyClass);
        }
    }
    
    public void moveToGuardian()
    {
        move(speed);
        turnTowards(MyWorld.guardian.getX(), MyWorld.guardian.getY());
    }
}
