import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bubbles2 here.
 * 
 * Kyle Tse 
 * June 14th
 */
public class Bubbles2 extends Actor
{
    /**
     * Act - do whatever the Bubbles2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage bubble2 = getImage();
    int frame = 15;
    int timer;
    
    public void Bubbles2()
    {
        bubble2.scale(1, 1);
    }
    
    public void act()
    {
        int x = getX();
        int y = getY();
        if(++timer % frame == 0) //increases speed of bubbles based on decreasing speed
        {
            setLocation(x + 10, y);
        }
        
        MyWorld world = (MyWorld)getWorld();
        
        if(getX() >= 600) //if bubble reaches edge of world, game over
        {
           world.gameOver();
        }
        
    }
}
