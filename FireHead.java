import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FireHead here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireHead extends Enemy
{
    private GreenfootImage fh1 = new GreenfootImage("firehead/fh1.png");
    private GreenfootImage fh2 = new GreenfootImage("firehead/fh2.png");
    private GreenfootImage fh3 = new GreenfootImage("firehead/fh3.png");
    private GreenfootImage fh4 = new GreenfootImage("firehead/fh4.png");
    private int frame = 0;
    
    public FireHead() 
    {
        super(2, 1);    
    }
    
    public void act()
    {
        super.enemyDead(this);
        super.moveToGuardian();
        moveToGuardian();
        getImage().scale(30,30);
        idleAnimation();
        frame++;
    }
    
    private void idleAnimation()
    {
        if(frame == 0) {
            this.setImage(fh1);
        }else if(frame == 10) {
            this.setImage(fh2);
        }else if(frame == 20) {
            this.setImage(fh3);
        }else if(frame == 30) {
            this.setImage(fh4);
            frame = 0;
        }
    }
}
