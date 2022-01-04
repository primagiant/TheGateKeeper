import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vampire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vampire extends Enemy
{
    private GreenfootImage v1 = new GreenfootImage("vampire/vampire_v2_1.png");
    private GreenfootImage v2 = new GreenfootImage("vampire/vampire_v2_2.png");
    private GreenfootImage v3 = new GreenfootImage("vampire/vampire_v2_3.png");
    private GreenfootImage v4 = new GreenfootImage("vampire/vampire_v2_4.png");
    private int frame = 0;
    
    public Vampire(){
        super(3, 1);
    }
    
    public void act()
    {
        super.act();
        super.enemyDead(this, 5);
        getImage().scale(22,22);
        idleAnimation();
        frame++;
    }
    
    private void idleAnimation()
    {
        if(frame == 0) {
            this.setImage(v1);
        }else if(frame == 10) {
            this.setImage(v2);
        }else if(frame == 20) {
            this.setImage(v3);
        }else if(frame == 30) {
            this.setImage(v4);
            frame = 0;
        }
    }
}
