import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    public GameOver() {
        getImage().scale(256, 156);
        prepare();
    }
    
    public void prepare()
    {
        Greenfoot.playSound("gameover_sound.wav");
    }
}
