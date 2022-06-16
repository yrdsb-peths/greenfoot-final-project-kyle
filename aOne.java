import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class One here.
 * 
 * Kyle Tse
 * June 10th
 */

//just used for an image in the points menu
public class aOne extends Actor
{
    /**
     * Act - do whatever the One wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage one = getImage();
    
    public void act()
    {
        one.scale (50, 40);
    }
}
