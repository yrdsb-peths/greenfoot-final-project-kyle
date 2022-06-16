import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Two here.
 * 
 * Kyle Tse 
 * June 10th
 */

//just used for an image in the points menu
public class bTwo extends Actor
{
    /**
     * Act - do whatever the Two wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage two = getImage();
    
    public void act()
    {
        two.scale (50, 40);
    }

}
