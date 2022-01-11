import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal extends Actor
{
    private GreenfootImage[] portal = {
        new GreenfootImage("portal/portal1.png"),
        new GreenfootImage("portal/portal2.png"),
        new GreenfootImage("portal/portal3.png"),
        new GreenfootImage("portal/portal4.png"),
    };
    
    private int frame = 0;
    public int maxEnemyEntry = 25;
    
    public void act()
    {
        this.getImage().scale(30, 30);
        enemyEnter();
        portalAnimation();
        frame++;
    }
    
    private void portalAnimation()
    {
        if(frame % 32 == 0) {
            setImage(portal[0]);
        } else if(frame % 16 == 7) {
            setImage(portal[1]);
        } else if(frame % 16 == 15) {
            setImage(portal[2]);
        } else if(frame % 16 == 23) {
            setImage(portal[3]);
        }
    }
    
    public void enemyEnter()
    {
        Actor enemy = getOneIntersectingObject(Enemy.class);
        if(enemy != null) {
            removeTouching(Enemy.class);
            maxEnemyEntry--;
        }
        portalDestroy();
    }
    
    public void portalDestroy() {
        if(maxEnemyEntry == 0) {
            getWorld().addObject(new GameOver(), 300, 300);
            Greenfoot.stop();
        }
    }
}
