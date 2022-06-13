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
    public pointsMenu()
    {    
        super(600, 400, 1); 
        One one = new One();
        addObject(one, 50, 150);
        Two two = new Two();
        addObject(two, 400, 150);
        Three three = new Three();
        addObject(three, 50, 250);
        Four four = new Four();
        addObject(four, 400, 250);
        addObject(points1, 150, 150);
        addObject(points2, 500, 150);
        addObject(points3, 150, 250);
        addObject(points4, 500, 250);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld GameWorld = new MyWorld();
            Greenfoot.setWorld(GameWorld);
        }
    }

}
