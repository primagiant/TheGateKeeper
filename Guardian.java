import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Guardian here.
 * 
 * @author (giant and adiani) 
 * @version (0.1 alpha)
 */
public class Guardian extends Actor
{
    private GreenfootImage[] guardian = {
        new GreenfootImage("guardian/g1.png"),
        new GreenfootImage("guardian/g2.png"),
        new GreenfootImage("guardian/g3.png"),
    };
    
    private GreenfootImage[] guardianDown = {
        new GreenfootImage("guardian/gb1.png"),
        new GreenfootImage("guardian/gb2.png"),
        new GreenfootImage("guardian/gb3.png"),
    };
    
    private GreenfootImage[] guardianRight = {
        new GreenfootImage("guardian/gr1.png"),
        new GreenfootImage("guardian/gr2.png"),
        new GreenfootImage("guardian/gr3.png"),
        new GreenfootImage("guardian/gr4.png"),
    };
    
    private GreenfootImage[] guardianLeft = {
        new GreenfootImage("guardian/gl1.png"),
        new GreenfootImage("guardian/gl2.png"),
        new GreenfootImage("guardian/gl3.png"),
        new GreenfootImage("guardian/gl4.png"),
    };
    
    private int frame = 0;
    public int movementSpeed = 2;
    
    public void act()
    {
        getImage().scale(30, 30);
        handleMovement();
        shoot();
        frame++;
    }
    
    private void shoot()
    {
        if (Greenfoot.mousePressed(null))
        {
            Fire fire = new Fire();
            getWorld().addObject(fire, getX(), getY());
            fire.setRotation(getRotation());
        }
    }
    
    private void handleMovement() 
    {
        if(Greenfoot.isKeyDown("W")) {
            setLocation(getX(), getY()-movementSpeed);
            backAnimation();
        } else if(Greenfoot.isKeyDown("S")) {
            setLocation(getX(), getY()+movementSpeed);
            idleAnimation();
        }
        if(Greenfoot.isKeyDown("A")) {
            setLocation(getX()-movementSpeed, getY());
            walkLeftAnimation();
        } else if(Greenfoot.isKeyDown("D")) {
            setLocation(getX()+movementSpeed, getY());
            walkRightAnimation();
        }
    }
    
    /*private void handleFacing()
    {
        if(Greenfoot.getMouseInfo() != null ) {
            turnTowards(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
            if(getRotation() <= 225 && getRotation() >= 136) { // kiri
                walkLeftAnimation();
            } else if (getRotation() <= 315 && getRotation() >= 226) { // atas
                backAnimation();
            } else if (getRotation() <= 135 && getRotation() >= 46) { // bawah
                idleAnimation();
            } else { // kanan
                walkRightAnimation();
            }
        }
    }*/
    
    private void idleAnimation()
    {
        if(frame % 24 == 0) {
            this.setImage(guardian[0]);
        }else if(frame % 24 == 9) {
            this.setImage(guardian[1]);
        }else if(frame % 24 == 17) {
            this.setImage(guardian[2]);
        }
    }
    
    private void backAnimation()
    {
        if(frame % 24 == 0) {
            this.setImage(guardianDown[0]);
        }else if(frame % 24 == 9) {
            this.setImage(guardianDown[1]);
        }else if(frame % 24 == 17) {
            this.setImage(guardianDown[2]);
        }
    }
    
    private void walkRightAnimation()
    {
        if(frame % 24 == 0) {
            this.setImage(guardianRight[0]);
        }else if(frame % 24 == 9) {
            this.setImage(guardianRight[1]);
        }else if(frame % 24 == 17) {
            this.setImage(guardianRight[2]);
        }else if(frame % 24 == 23) {
            this.setImage(guardianRight[3]);
        }
    }
    
    private void walkLeftAnimation()
    {
        if(frame % 24 == 0) {
            this.setImage(guardianLeft[0]);
        }else if(frame % 24 == 9) {
            this.setImage(guardianLeft[1]);
        }else if(frame % 24 == 17) {
            this.setImage(guardianLeft[2]);
        }else if(frame % 24 == 23) {
            this.setImage(guardianLeft[3]);
        }
    }
}
