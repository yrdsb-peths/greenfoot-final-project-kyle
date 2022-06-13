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
    GreenfootSound lost = new GreenfootSound("gameOver.wav");
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        super(600, 400, 1); 
        addObject(gameOver, 300, 200);
        lost.play();
    }
}
