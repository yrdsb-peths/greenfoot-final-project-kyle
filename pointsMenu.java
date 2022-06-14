import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pointsMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pointsMenu extends World
{
    Label points1 = new Label ("= 1 point", 40);
    Label points2 = new Label ("= 2 points", 40);
    Label points3 = new Label ("= 3 points", 40);
    Label points4 = new Label ("= 4 points", 40);
    Label goBack = new Label ("<-- (R) GO BACK", 23);
    public pointsMenu()
    {    
        super(600, 400, 1); 
        aOne one = new aOne();
        addObject(one, 50, 100);
        bTwo two = new bTwo();
        addObject(two, 400, 100);
        cThree three = new cThree();
        addObject(three, 50, 250);
        dFour four = new dFour();
        addObject(four, 400, 250);
        
        addObject(points1, 150, 100);
        addObject(points2, 500, 100);
        addObject(points3, 150, 250);
        addObject(points4, 500, 250);
        addObject(goBack, 75, 390);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("R"))
        {
            TitleScreen titleWorld = new TitleScreen();
            Greenfoot.setWorld(titleWorld);
        }
    }

}
