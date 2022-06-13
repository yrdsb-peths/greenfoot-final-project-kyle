import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fisherman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fisherman extends Actor
{
    /**
     * Act - do whatever the Fisherman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] walkRight;
    GreenfootImage[] walkLeft;
    GreenfootImage[] castRight;
    GreenfootImage[] castLeft;
    GreenfootImage[] typeFish;
    GreenfootImage[] reelRight;
    GreenfootImage[] reelLeft;
    GreenfootImage[] fishLeft;
    GreenfootImage[] fishRight;
    GreenfootImage[] currAnim;
    GreenfootSound plopWater = new GreenfootSound("castingLine.mp3");
    int animTimer;
    public Fisherman()
    {
        walkRight = new GreenfootImage[5];
        walkLeft = new GreenfootImage[5];
        castRight = new GreenfootImage[5];
        castLeft = new GreenfootImage[5];
        reelRight = new GreenfootImage[5];
        reelLeft = new GreenfootImage[5];
        fishRight = new GreenfootImage[5];
        fishLeft = new GreenfootImage[5];
        
        for (int i = 0; i < 5; i++)
        {
            walkRight[i] = new GreenfootImage("images/walkingAni/walking" + i + ".png");
            walkRight[i].scale(100,80);
            walkLeft[i] = new GreenfootImage("images/walkingAni/walking" + i + ".png");
            walkLeft[i].scale(100,80);
            walkLeft[i].mirrorHorizontally();
            castRight[i] = new GreenfootImage("images/castAni/cast" + i + ".png");
            castRight[i].scale(100,80);
            castLeft[i] = new GreenfootImage("images/castAni/cast" + i + ".png");
            castLeft[i].scale(100,80);
            castLeft[i].mirrorHorizontally();
            reelRight[i] = new GreenfootImage("images/reelingAni/reel" + i + ".png");
            reelRight[i].scale(100,80);
            reelLeft[i] = new GreenfootImage("images/reelingAni/reel" + i + ".png");
            reelLeft[i].scale(100,80);
            reelLeft[i].mirrorHorizontally();
            fishRight[i] = new GreenfootImage("images/fishingAni/fishing" + i + ".png");
            fishRight[i].scale(100,53);
            fishLeft[i] = new GreenfootImage("images/fishingAni/fishing" + i + ".png");
            fishLeft[i].scale(100,53);
            fishLeft[i].mirrorHorizontally();
        }
        
        setAnimation(walkRight);
    }
    
    private void setAnimation(GreenfootImage[] anim)
    {
        currAnim = anim;
        animTimer = -1;
        setImage();
    }
    
    private void setImage()
    {
        animTimer = (animTimer+1)%(10*currAnim.length);
        if(animTimer%10 == 0) 
        {
            setImage(currAnim[animTimer/10]);
        }
    }
    
    public void act()
    {
        if (!reeling() && ! casting())
        {
            move();
        }
    }
    
    boolean reeling()
    {
        if (currAnim == reelLeft || currAnim == reelRight)
        {
            setImage();
            if(animTimer == 0)
            {
                setAnimation(currAnim == reelLeft ? walkLeft : walkRight);
                if (isTouching(Bubbles.class))
                {
                    ((MyWorld)getWorld()).getFish();
                    removeTouching(Bubbles.class);
                    MyWorld world = (MyWorld) getWorld();
                    world.spawnBubbles();
                }
            }
            else
            {
                return true;
            }
        }
        
        if(Greenfoot.isKeyDown("e"))
        {
            if (currAnim == fishLeft || currAnim == fishRight)
            {
                setAnimation(currAnim == fishLeft ? reelLeft : reelRight);
                return true;
            }
        }
        
        return false;
    }

    private boolean casting()
    {
        int x = 0;
        if (currAnim == castLeft || currAnim == castRight)
        {
            setImage();
            if(animTimer == 0)
            {
                setAnimation(currAnim == castLeft ? fishLeft : fishRight);
            }
            else 
            {
                return true;
            }
        }
        
        if (Greenfoot.isKeyDown("f"))
        {
            setAnimation(currAnim == walkLeft ? castLeft : castRight);
            plopWater.play();
            return true;
        }
        return false;
    }
    
    private void move()
    {
        int dx = 0;
        if (Greenfoot.isKeyDown ("a"))
        {
            dx--;
        }
        
        if (Greenfoot.isKeyDown("d"))
        {
            dx++;
        }
        
        if(dx == 0)
        {
            return;
        }
        
        setLocation(getX()+dx, getY());
        if (isTouching(Boundary.class))
        {
            setLocation(getX()-dx, getY());
        }
        
        if (dx < 0 && currAnim != walkLeft)
        {
            setAnimation(walkLeft);
        }
        
        else if (dx > 0 && currAnim != walkRight)
        {
            setAnimation(walkRight);
        }
        
        else
        {
            setImage();
        }
    }
}
