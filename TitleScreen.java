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
    Label instructions = new Label ("<-- (Q) INSTRUCTIONS", 23);
    Label pointsMenu = new Label ("POINTS MENU (E) -->", 23);
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
        addObject(instructions, 100, 390);
        addObject(pointsMenu, 505, 390);
    }
    
    public void act()
    {
        //start when user presses spacebar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld GameWorld = new MyWorld();
            Greenfoot.setWorld(GameWorld);
        }
        
        if(Greenfoot.isKeyDown("Q"))
        {
            Instructions InsWorld = new Instructions();
            Greenfoot.setWorld(InsWorld);
        }
        
        if(Greenfoot.isKeyDown("E"))
        {
            pointsMenu pointWorld = new pointsMenu();
            Greenfoot.setWorld(pointWorld);
        }
        
    }
}
