import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends World
{
    Label howTo = new Label ("Press - A - and - D - to move left and right", 30);
    Label howTo2 = new Label ("Press - F - to cast and - E - to reel in fishing rod", 30);
    Label howTo3 = new Label ("Reel in fishing rod on the bubbles to catch fish", 30);
    Label howTo4 = new Label ("Dont let the bubbles pass!", 30);
    Label goBack = new Label ("GO BACK (R) -->", 23);
    Label title = new Label ("INSTRUCTIONS", 50);
    Label underline = new Label ("______________________",50);
    Label underline2 = new Label ("______________________",50);
    GreenfootSound button = new GreenfootSound("button.mp3");
    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Instructions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(howTo, 300, 160);
        addObject(howTo2, 300, 200);
        addObject(howTo3, 300, 240);
        addObject(howTo4, 300, 280);
        addObject(goBack, 525, 390);
        addObject(title, 300, 80);
        addObject(underline, 300, 100);
        addObject(underline2, 300, 300);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("R"))
        {
            button.setVolume(40);
            button.play();
            TitleScreen titleWorld = new TitleScreen();
            Greenfoot.setWorld(titleWorld);
        }
    }
}
