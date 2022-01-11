import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartMenu extends World
{
    Guardian guardian = new Guardian();
    StartText startText = new StartText();
    public StartMenu()
    {    
        super(600, 600, 1); 
        prepare(); 
    }
    
    public void prepare() {
        addObject(guardian,300,400);
        addObject(startText,300,300);
    }
    
    public void act()
    {
        guardian.getImage().scale(100,100);
        if(Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
