import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vampire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vampire extends Enemy
{
     private GreenfootImage[] vampireUp = {
        new GreenfootImage("vampire/vu1.png"),
        new GreenfootImage("vampire/vu2.png"),
        new GreenfootImage("vampire/vu3.png"),
        new GreenfootImage("vampire/vu4.png"),
    };
    private GreenfootImage[] vampireDown = {
        new GreenfootImage("vampire/vd1.png"),
        new GreenfootImage("vampire/vd2.png"),
        new GreenfootImage("vampire/vd3.png"),
        new GreenfootImage("vampire/vd4.png"),
    };
    private GreenfootImage[] vampireRight = {
        new GreenfootImage("vampire/vr1.png"),
        new GreenfootImage("vampire/vr2.png"),
        new GreenfootImage("vampire/vr3.png"),
        new GreenfootImage("vampire/vr4.png"),
    };
    private GreenfootImage[] vampireLeft = {
        new GreenfootImage("vampire/vl1.png"),
        new GreenfootImage("vampire/vl2.png"),
        new GreenfootImage("vampire/vl3.png"),
        new GreenfootImage("vampire/vl4.png"),
    };
    private int frame = 0;
    
    public Vampire(){
        super(3, 1);
    }
    
    public void act()
    {
        super.act();
        super.enemyDead(this, 5);
        getImage().scale(22,22);
        animation();
        frame++;
    }
    
    private void animation(){
        if (this.getRotation() >= 316 || this.getRotation() <= 45){
            rightAnimation();
        }else if(this.getRotation() >= 46 && this.getRotation() <= 135){
            upAnimation();
        }else if(this.getRotation() >= 136 && this.getRotation() <= 225){
            leftAnimation();
        }else if(this.getRotation() >= 226 && this.getRotation() <= 315){
            downAnimation();
        }
    }
    
    private void upAnimation()
    {
        if(frame == 0) {
            this.setImage(vampireUp[0]);
        }else if(frame == 10) {
            this.setImage(vampireUp[1]);
        }else if(frame == 20) {
            this.setImage(vampireUp[2]);
        }else if(frame == 30) {
            this.setImage(vampireUp[3]);
            frame = 0;
        }
    }
    
    private void downAnimation()
    {
        if(frame == 0) {
            this.setImage(vampireDown[0]);
        }else if(frame == 10) {
            this.setImage(vampireDown[1]);
        }else if(frame == 20) {
            this.setImage(vampireDown[2]);
        }else if(frame == 30) {
            this.setImage(vampireDown[3]);
            frame = 0;
        }
    }
    
    private void rightAnimation()
    {
        if(frame == 0) {
            this.setImage(vampireRight[0]);
        }else if(frame == 10) {
            this.setImage(vampireRight[1]);
        }else if(frame == 20) {
            this.setImage(vampireRight[2]);
        }else if(frame == 30) {
            this.setImage(vampireRight[3]);
            frame = 0;
        }
    }
    
    private void leftAnimation()
    {
        if(frame == 0) {
            this.setImage(vampireLeft[0]);
        }else if(frame == 10) {
            this.setImage(vampireLeft[1]);
        }else if(frame == 20) {
            this.setImage(vampireLeft[2]);
        }else if(frame == 30) {
            this.setImage(vampireLeft[3]);
            frame = 0;
        }
    }
}
