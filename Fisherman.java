import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fisherman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fisherman extends Actor
{
    /**
     * Act - do whatever the Fisherman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 5;
    GreenfootImage[] idleRight = new GreenfootImage[2];
    GreenfootImage[] idleLeft = new GreenfootImage[2];
    
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Fisherman()
    {
        for (int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/idleAni/idle" + i + ".png");
            idleRight[i].scale(100,80);
        }
        
        for (int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/idleAni/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(100,80);
        }
        
        animationTimer.mark();
        setImage(idleRight[1]);
    }
    
    int imageIndex = 0;
    public void idle()
    {
        if(animationTimer.millisElapsed() < 500)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
    
    
    
    public void fish()
    {
        if (Greenfoot.isKeyDown("f"))
        {
            
        }
    }
    
    public void move()
    {
        int dx = 0;
        if (Greenfoot.isKeyDown("d")) 
        {
            dx++;
            facing = "right";

        }
        
        if (Greenfoot.isKeyDown("a")) 
        {
            dx--;
            facing = "left";
        }
        
        setLocation(getX()+dx, getY());
        if (isTouching(Boundary.class))
        {
            setLocation(getX()-dx, getY());
        }
        
        idle();
    }
    
       public void act()
    {
        move();
    }
}
