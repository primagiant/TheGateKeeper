import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Actor
{
    private GreenfootImage[] wall = {
        new GreenfootImage("wall/wall1.png"),
        new GreenfootImage("wall/wall2.png"),
    };
    private int frame = 0;
   
    private void wallAnimation()
    {
        if(frame % 16 == 0) {
            this.setImage(wall[0]);
        }else if(frame % 16 == 9) {
            this.setImage(wall[1]);
        }
    }

    public void act()
    {
        wallAnimation();
        getImage().scale(30, 30);
        frame++;
    }
}
    

