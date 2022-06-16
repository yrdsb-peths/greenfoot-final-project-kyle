import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    Label gameOver = new Label ("Game Over :(", 80);
    Label myScore = new Label ("Score: ", 40);
    public Label scoreLabel = new Label (0,40);
    Label retry = new Label ("Press - R - to try again", 35);
    GreenfootSound lost = new GreenfootSound ("gameOver.wav");
    GreenfootSound button = new GreenfootSound("button.mp3");
    
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver(final int score)
    {    
        super(600, 400, 1); 
        addObject(gameOver, 300, 200);
        addObject(myScore, 280, 280);
        scoreLabel.setValue(score);
        addObject(scoreLabel, 345, 282);
        lost.play();
        addObject(retry, 300, 320);
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("R"))
        {
            button.setVolume(40);
            button.play();
            lost.stop();
            TitleScreen titleWorld = new TitleScreen();
            Greenfoot.setWorld(titleWorld);
        }
    }
    
    
}
