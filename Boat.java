import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boat here.
 * 
 * Kyle Tse
 * June 5th
 */
public class Boat extends Actor //image for boat
{
    /**
     * Act - do whatever the Boat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage boats = getImage();
    
    public Boat()
    {
        boats.scale(300, 55);
    }
}
