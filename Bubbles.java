import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bubbles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bubbles extends Actor
{
    /**
     * Act - do whatever the bubbles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage bubble = getImage();
    int speed = 10;
    int timer;
    
    public void Bubbles()
    {
        bubble.scale(1, 1);
    }
    
    public void act()
    {
        int x = getX();
        int y = getY();
        if(++timer % speed == 0)
        {
            setLocation(x - 10, y);
        }
        
        MyWorld world = (MyWorld)getWorld();
        
        if(getX() <= 0)
        {
           world.gameOver();
        }
        
    }
}
