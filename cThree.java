import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Three here.
 * 
 * Kyle Tse
 * Jue 10th
 */

//just used for an image in the points menu
public class cThree extends Actor
{
    /**
     * Act - do whatever the Three wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage three = getImage();
    
    public void act()
    {
        three.scale (50, 40);
    }

}
