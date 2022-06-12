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
    private final int typeCount = 4;
    GreenfootImage[] fishImages;
    GreenfootSound backgroundMusic = new GreenfootSound("peacefulmusic.mp3");
    GreenfootSound gotFish = new GreenfootSound("gotFish.wav");
    private int[] fishCount = new int[] {50, 30, 15, 5};
    public int score = 0;
    public Label scoreLabel = new Label(0,30);
    Label fishCaught = new Label ("Fish Caught: ", 30);
    Label myScore = new Label ("Score: ", 30);
    public MyWorld()
    {    
        super(600, 400, 1, false); 
        addObject(fishCaught, 480, 10);
        addObject(myScore, 527, 45);
        fishImages = new GreenfootImage[typeCount];
        Fisherman man = new Fisherman();
        addObject(man, 200, 275);
        Boat boat = new Boat();
        addObject(boat, 200, 300);
        spawnBubbles();
        //invisible boundary for boat
        Boundary boundary1 = new Boundary();
        addObject(boundary1, 62, 300);
        Boundary boundary2 = new Boundary();
        addObject(boundary2, 325, 300);
        //score
        addObject(scoreLabel, 580, 47);
        backgroundMusic.play();
        for (int i = 0; i < typeCount; i++)
        {
            fishImages[i] = new GreenfootImage("Images/fishTypes/fish" + i + ".png");
        }
    }

    //choosing a fish
    public void getFish()
    {
        int[] fishes = new int[100];
        int n = 0;
        //making an array for each type of fish using the percentages in the
        //fishCount array so that when it chooses a random number, depending on 
        //which fish's array the number is in,it will choose that type of fish
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
        Actor tempActor = new TempImage();
        tempActor.setImage(image);
        addObject(tempActor, 580, 13);
        if (type == 0)
        {
            CincreaseScore();
        }
        
        if (type == 1)
        {
            RincreaseScore();
        }
        
        if (type == 2)
        {
            EincreaseScore();
        }
        
        if (type == 3)
        {
            LincreaseScore();
        }
        gotFish.setVolume(70);
        gotFish.play();
    }
    
    public void CincreaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    public void RincreaseScore()
    {
        score += 2;
        scoreLabel.setValue(score);
    }
    
    public void EincreaseScore()
    {
        score += 3;
        scoreLabel.setValue(score);
    }
    
    public void LincreaseScore()
    {
        score += 4;
        scoreLabel.setValue(score);
    }
    
    public void spawnBubbles()
    {
        Bubbles b = new Bubbles();
        int x = 500;
        int y = 290;
        addObject (b, x, y);
    }
}
