import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverWorld extends World
{
    private GameOver gameover = new GameOver();
    private int frame = 0;
    public GameOverWorld()
    {      
        super(600, 600, 1); 
        prepare(); 
    }
    
    public void prepare() {
        addObject(new GameOver(), 300, 300);
        String scoreText = "Your Score : " + MyWorld.score;
        showText(scoreText, 300, 400);
    }
    
    public void act()
    {
        gameover.getImage().scale(100,100);
        if(frame == 300) 
        {
            Greenfoot.setWorld(new StartMenu());
        }
        frame++;
    }
}
