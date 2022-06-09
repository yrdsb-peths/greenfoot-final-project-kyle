import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boat extends Actor
{
    /**
     * Act - do whatever the Boat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage boats = getImage();
    
    public Boat()
    {
        boats.scale(200, 50);
    }
    
    private void move()
    {
        int dx = 0;
        if (Greenfoot.isKeyDown ("a"))
        {
            dx--;
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            dx++;
        }
    }
}
