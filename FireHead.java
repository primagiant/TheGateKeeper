import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FireHead here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireHead extends Enemy
{
    private GreenfootImage[] fireheadUp = {
        new GreenfootImage("firehead/fhu1.png"),
        new GreenfootImage("firehead/fhu2.png"),
        new GreenfootImage("firehead/fhu3.png"),
        new GreenfootImage("firehead/fhu4.png"),
    };
    private GreenfootImage[] fireheadDown = {
        new GreenfootImage("firehead/fhd1.png"),
        new GreenfootImage("firehead/fhd2.png"),
        new GreenfootImage("firehead/fhd3.png"),
        new GreenfootImage("firehead/fhd4.png"),
    };
    private GreenfootImage[] fireheadRight = {
        new GreenfootImage("firehead/fhr1.png"),
        new GreenfootImage("firehead/fhr2.png"),
        new GreenfootImage("firehead/fhr3.png"),
        new GreenfootImage("firehead/fhr4.png"),
    };
    private GreenfootImage[] fireheadLeft = {
        new GreenfootImage("firehead/fhl1.png"),
        new GreenfootImage("firehead/fhl2.png"),
        new GreenfootImage("firehead/fhl3.png"),
        new GreenfootImage("firehead/fhl4.png"),
    };
    private int frame = 0;
    
    public void act()
    {
        super.enemyDead(this, 2);
        super.moveToGuardian();
        moveToGuardian();
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
            this.setImage(fireheadUp[0]);
        }else if(frame == 10) {
            this.setImage(fireheadUp[1]);
        }else if(frame == 20) {
            this.setImage(fireheadUp[2]);
        }else if(frame == 30) {
            this.setImage(fireheadUp[3]);
            frame = 0;
        }
    }
    
    private void downAnimation()
    {
        if(frame == 0) {
            this.setImage(fireheadDown[0]);
        }else if(frame == 10) {
            this.setImage(fireheadDown[1]);
        }else if(frame == 20) {
            this.setImage(fireheadDown[2]);
        }else if(frame == 30) {
            this.setImage(fireheadDown[3]);
            frame = 0;
        }
    }
    
    private void rightAnimation()
    {
        if(frame == 0) {
            this.setImage(fireheadRight[0]);
        }else if(frame == 10) {
            this.setImage(fireheadRight[1]);
        }else if(frame == 20) {
            this.setImage(fireheadRight[2]);
        }else if(frame == 30) {
            this.setImage(fireheadRight[3]);
            frame = 0;
        }
    }
    
    private void leftAnimation()
    {
        if(frame == 0) {
            this.setImage(fireheadLeft[0]);
        }else if(frame == 10) {
            this.setImage(fireheadLeft[1]);
        }else if(frame == 20) {
            this.setImage(fireheadLeft[2]);
        }else if(frame == 30) {
            this.setImage(fireheadLeft[3]);
            frame = 0;
        }
    }
}
