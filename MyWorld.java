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
    private final int typeCount = 1;
    GreenfootImage[] fishImages = new GreenfootImage[typeCount];
    private int[] fishCount = new int[] {10, 20, 70};
    public int score = 0;
    public Label scoreLabel = new Label(0,80);
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
        //score
        addObject(scoreLabel, 50, 50);
        
        for (int i = 0; i < 1; i++)
        {
            fishImages[i] = new GreenfootImage("Images/fishTypes/fish" + i + ".png");
        }
    }

    
    //choosing a fish
    public void getFish()
    {
        int[] fishes = new int[100];
        int n = 0;
        /*making an array for each type of fish using the percentages in the
        fishCount array so that when it chooses a random number, depending on 
        which fish's array the number is in,it will choose that type of fish*/
        for (int t=0; t<typeCount; t++)
        {
            for (int i=0; i<fishCount[t]; i++) 
            fishes[n+i] = t;
            n += fishCount[t];
        }
         
        // choose a caught fish
        int caughtFish = Greenfoot.getRandomNumber(100);
        int type = fishes[caughtFish]; // type of fish caught
        GreenfootImage image = fishImages[type];
    }
}
