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
    private int currentFrame = 0;
    private int speed = 5;
    GreenfootImage[] idleRight = new GreenfootImage[5];
    GreenfootImage[] idleLeft = new GreenfootImage[5];
    GreenfootImage[] cast = new GreenfootImage[5];
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    public Fisherman()
    {
        for (int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/walkingAni/walking" + i + ".png");
            idleRight[i].scale(100,80);
        }
        
        for (int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/walkingAni/walking" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(100,80);
        }
        
        animationTimer.mark();
        setImage(idleRight[1]);
    }
    
    int imageIndex = 0;
    public void idle()
    {
        if(animationTimer.millisElapsed() < 200)
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
    
    public void cast()
    {
        if (Greenfoot.isKeyDown("f"))
        {
            cast[1] = new GreenfootImage("images/castAni/cast0.png");
            setImage(cast[1]);
            cast[2] = new GreenfootImage("images/castAni/cast1.png");
            setImage(cast[2]);
            cast[3] = new GreenfootImage("images/castAni/cast2.png");
            setImage(cast[3]);
            cast[4] = new GreenfootImage("images/castAni/cast3.png");
            setImage(cast[4]);
            cast[5] = new GreenfootImage("images/castAni/cast4.png");
            setImage(cast[5]);
        }
    }
    
    public void move()
    {
        int dx = 0;
        if (Greenfoot.isKeyDown("d")) 
        {
            dx++;
            facing = "right";
            idle();
        }
        
        if (Greenfoot.isKeyDown("a")) 
        {
            dx--;
            facing = "left";
            idle();
        }
        
        setLocation(getX()+dx, getY());
        if (isTouching(Boundary.class))
        {
            setLocation(getX()-dx, getY());
        }
        
    }
    
    public void act()
    {
        /*int frame = 0;
        currentFrame = (currentFrame + 1) % 50;
        if (frame % 10 == 0) 
        {
            final int imageIndex = frame / 60;
            setImage(new GreenfootImage("images/castAni/cast" + imageIndex + ".png"));
            frame++;
        }&*/
        move();
    }
}
