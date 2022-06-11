import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label ("Fishing Frenzy", 75);
    Label start = new Label ("Press - SPACE - to start", 30);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        addObject(start, 300, 260);
    }
    
    public void act()
    {
        //start when user presses spacebar
        if(Greenfoot.isKeyDown("space"))
        {
            Instructions nextWorld = new Instructions();
            Greenfoot.setWorld(nextWorld);
        }
        
    }
}
