import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Four here.
 * 
 * Kyle Tse 
 * June 10th
 */

//just used for an image in the points menu
public class dFour extends Actor
{
    /**
     * Act - do whatever the Four wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage four = getImage();
    
    public void act()
    {
        four.scale (50, 40);
    }

}
