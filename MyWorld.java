import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (giant and adiani) 
 * @version (0.1 alpha)
 */
public class MyWorld extends World
{
    private int frame = 0;
    private int spawnSpeed = 80; // semakin kecil angkanya semakin cepat spawn enemynya
    public int randomSpawnPosition;
    
    public static Guardian guardian = new Guardian();
    
    public MyWorld()
    {    
        super(600, 600, 1); 
        prepare();
    }
    
    private void prepare() 
    {
        addObject(guardian, 300, 350);
        addObject(new Portal(), getWidth()/2, getHeight()/2);
    }
    
    public void act() 
    {
        //spawnEnemy();
        frame++;
    }
    
    private void spawnEnemy()
    {
        if(frame % spawnSpeed == 0){
            randomSpawnPosition = Greenfoot.getRandomNumber(4);
            switch(randomSpawnPosition)
            {
                case 0 : addObject(new FireHead(), 0, getHeight()/2);break;
                case 1 : addObject(new FireHead(), getWidth(), getHeight()/2);break;
                case 2 : addObject(new FireHead(), getWidth()/2, 0);break;
                case 3 : addObject(new FireHead(), getWidth()/2, getHeight());break;
            }   
        }
    }
}
