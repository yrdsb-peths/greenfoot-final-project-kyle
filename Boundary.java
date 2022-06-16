import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boundary here.
 * 
 * Kyle Tse
 * June 6th
 */
public class Boundary extends Actor //invisible boundary
{
    /**
     * Act - do whatever the boundary wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage boundaries = getImage();
    public void Boundary()
    {
        boundaries.scale(1, 1);
    }
}
