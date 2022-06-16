import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bubbles here.
 * 
 * Kyle Tse 
 * June 14th
 */
public class Bubbles extends Actor
{
    /**
     * Act - do whatever the bubbles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage bubble = getImage();
    int frame = 15;
    int timer;
    
    public void Bubbles()
    {
        bubble.scale(1, 1);
    }
    
    public void act()
    {
        int x = getX();
        int y = getY();
        if(++timer % frame == 0) //increases speed of bubbles based on decreasing speed
        {
            setLocation(x - 10, y);
        }
        
        MyWorld world = (MyWorld)getWorld();
        
        if(getX() <= 0) //if bubble reaches edge of world, game over
        {
           world.gameOver();
        }
        
    }
}
