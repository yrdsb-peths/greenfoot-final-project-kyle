import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pointsMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pointsMenu extends World
{
    Label points1 = new Label ("= 1 point (50%)", 30);
    Label points2 = new Label ("= 2 points (30%)", 30);
    Label points3 = new Label ("= 3 points (15%)", 30);
    Label points4 = new Label ("= 4 points (5%)", 30);
    Label goBack = new Label ("<-- (R) GO BACK", 23);
    GreenfootSound button = new GreenfootSound("button.mp3");
    
    public pointsMenu()
    {    
        super(600, 400, 1); 
        aOne one = new aOne();
        addObject(one, 40, 100);
        bTwo two = new bTwo();
        addObject(two, 390, 100);
        cThree three = new cThree();
        addObject(three, 40, 250);
        dFour four = new dFour();
        addObject(four, 390, 250);
        
        addObject(points1, 155, 100);
        addObject(points2, 505, 100);
        addObject(points3, 155, 250);
        addObject(points4, 505, 250);
        addObject(goBack, 75, 390);
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
