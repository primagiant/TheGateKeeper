import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skeleton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skeleton extends Enemy
{
    private GreenfootImage s1 = new GreenfootImage("skeleton/skeleton_v2_1.png");
    private GreenfootImage s2 = new GreenfootImage("skeleton/skeleton_v2_2.png");
    private GreenfootImage s3 = new GreenfootImage("skeleton/skeleton_v2_3.png");
    private GreenfootImage s4 = new GreenfootImage("skeleton/skeleton_v2_4.png");
    private int frame = 0;
    
    public void act()
    {
        super.act();
        super.enemyDead(this);
        getImage().scale(22, 22);
        idleAnimation();
        frame++;
    }
    
    private void idleAnimation()
    {
        if(frame == 0) {
            this.setImage(s1);
        }else if(frame == 10) {
            this.setImage(s2);
        }else if(frame == 20) {
            this.setImage(s3);
        }else if(frame == 30) {
            this.setImage(s4);
            frame = 0;
        }
    }
}
