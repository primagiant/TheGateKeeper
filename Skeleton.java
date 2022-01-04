import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skeleton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skeleton extends Enemy
{
     private GreenfootImage[] skeletonUp = {
        new GreenfootImage("skeleton/su1.png"),
        new GreenfootImage("skeleton/su2.png"),
        new GreenfootImage("skeleton/su3.png"),
        new GreenfootImage("skeleton/su4.png"),
    };
    private GreenfootImage[] skeletonDown = {
        new GreenfootImage("skeleton/sd1.png"),
        new GreenfootImage("skeleton/sd2.png"),
        new GreenfootImage("skeleton/sd3.png"),
        new GreenfootImage("skeleton/sd4.png"),
    };
    private GreenfootImage[] skeletonRight = {
        new GreenfootImage("skeleton/sr1.png"),
        new GreenfootImage("skeleton/sr2.png"),
        new GreenfootImage("skeleton/sr3.png"),
        new GreenfootImage("skeleton/sr4.png"),
    };
    private GreenfootImage[] skeletonLeft = {
        new GreenfootImage("skeleton/sl1.png"),
        new GreenfootImage("skeleton/sl2.png"),
        new GreenfootImage("skeleton/sl3.png"),
        new GreenfootImage("skeleton/sl4.png"),
    };
    private int frame = 0;
    
    public void act()
    {
        super.moveToTheMiddle();
        super.enemyDead(this, 3);
        getImage().scale(22, 22);
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
            this.setImage(skeletonUp[0]);
        }else if(frame == 10) {
            this.setImage(skeletonUp[1]);
        }else if(frame == 20) {
            this.setImage(skeletonUp[2]);
        }else if(frame == 30) {
            this.setImage(skeletonUp[3]);
            frame = 0;
        }
    }
    
    private void downAnimation()
    {
        if(frame == 0) {
            this.setImage(skeletonDown[0]);
        }else if(frame == 10) {
            this.setImage(skeletonDown[1]);
        }else if(frame == 20) {
            this.setImage(skeletonDown[2]);
        }else if(frame == 30) {
            this.setImage(skeletonDown[3]);
            frame = 0;
        }
    }
    
    private void rightAnimation()
    {
        if(frame == 0) {
            this.setImage(skeletonRight[0]);
        }else if(frame == 10) {
            this.setImage(skeletonRight[1]);
        }else if(frame == 20) {
            this.setImage(skeletonRight[2]);
        }else if(frame == 30) {
            this.setImage(skeletonRight[3]);
            frame = 0;
        }
    }
    
    private void leftAnimation()
    {
        if(frame == 0) {
            this.setImage(skeletonLeft[0]);
        }else if(frame == 10) {
            this.setImage(skeletonLeft[1]);
        }else if(frame == 20) {
            this.setImage(skeletonLeft[2]);
        }else if(frame == 30) {
            this.setImage(skeletonLeft[3]);
            frame = 0;
        }
    }
}
