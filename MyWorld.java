import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 400, 1, false); 
        
        Fisherman man = new Fisherman();
        addObject(man, 200, 275);
        Boat boat = new Boat();
        addObject(boat, 200, 300);
        //invisible boundary for boat
        Boundary boundary1 = new Boundary();
        addObject(boundary1, 62, 300);
        Boundary boundary2 = new Boundary();
        addObject(boundary2, 325, 300);
        
    }
    
    public void cFish()
    {
        Fish c = new Fish();
        int x = 300;
        int y = 200;
        addObject (c, x, y);
    }
}
