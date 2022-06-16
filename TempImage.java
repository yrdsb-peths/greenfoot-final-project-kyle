import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cFish here.
 * 
 * Kyle Tse 
 * June 8th
 */

public class TempImage extends Actor //shows a temporary image of the fish caught
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
        if (++timer == 90) getWorld().removeObject(this);
    }
}
