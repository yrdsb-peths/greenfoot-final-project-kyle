import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cFish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class TempImage extends Actor
{
    /**
     * Act - do whatever the cFish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage fishType = getImage();
    GreenfootImage[] fishImages;
    private final int typeCount = 3;
    int timer;
 
    
    public void act()
    {
        if (++timer == 120) getWorld().removeObject(this);
    }
}
