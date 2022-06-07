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
    
    /*GreenfootImage[] walkRight = new GreenfootImage[5];
    GreenfootImage[] walkLeft = new GreenfootImage[5];
    GreenfootImage[] castRight = new GreenfootImage[5];
    GreenfootImage[] castLeft = new GreenfootImage[5];
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();*/
    GreenfootImage[] walkRight, walkLeft, castRight, castLeft, currAnim;
    int animTimer;
    public Fisherman()
    {
        walkRight = new GreenfootImage[5];
        walkLeft = new GreenfootImage[5];
        castRight = new GreenfootImage[5];
        castLeft = new GreenfootImage[5];
        
        for (int i = 0; i < 5; i++)
        {
            walkRight[i] = new GreenfootImage("images/walkingAni/walking" + i + ".png");
            walkRight[i].scale(100,80);
            walkLeft[i] = new GreenfootImage("images/walkingAni/walking" + i + ".png");
            walkLeft[i].scale(100,80);
            castRight[i] = new GreenfootImage("images/castAni/cast" + i + ".png");
            castRight[i].scale(100,80);
            castLeft[i] = new GreenfootImage("images/castAni/cast" + i + ".png");
            castLeft[i].scale(100,80);
        }
        
        setAnimation(walkRight);
    
    
        /*for (int i = 0; i < walkRight.length; i++)
        {
            walkRight[i] = new GreenfootImage("images/walkingAni/walking" + i + ".png");
            walkRight[i].scale(100,80);
        }
        
        for (int i = 0; i < walkLeft.length; i++)
        {
            walkLeft[i] = new GreenfootImage("images/walkingAni/walking" + i + ".png");
            walkLeft[i].mirrorHorizontally();
            walkLeft[i].scale(100,80);
        }
        
        
        animationTimer.mark();
        setImage(walkRight[1]);*/
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
        if(!casting())
        {
            move();
        }
    }
    
    /*int imageIndex = 0;
    public void walk()
    {
        if(animationTimer.millisElapsed() < 200)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
            setImage(walkRight[imageIndex]);
            imageIndex = (imageIndex + 1) % walkRight.length;
        }
        
        else
        {
            setImage(walkLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % walkLeft.length;
        }
    }*/
    
    private boolean casting()
    {
        if (currAnim == castLeft || currAnim == castRight)
        {
            setImage();
            if(animTimer == 0)
            {
                setAnimation(currAnim == castLeft ? walkLeft : walkRight);
            }
            else 
            {
                return true;
            }
        }
        
        if (Greenfoot.isKeyDown("f"))
        {
            setAnimation(currAnim == walkLeft ? castLeft : castRight);
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
    
    /*public void casting()
    {
        for (int i = 0; i < castRight.length; i++)
        {
            castRight[i] = new GreenfootImage("images/castAni/cast" + i + ".png");
            castRight[i].scale(100,80);
        }
        
        for (int i = 0; i < castLeft.length; i++)
        {
            castLeft[i] = new GreenfootImage("images/castAni/cast" + i + ".png");
            castLeft[i].mirrorHorizontally();
            castLeft[i].scale(100,80);
        }
        
        if(animationTimer.millisElapsed() < 200)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
            setImage(castRight[imageIndex]);
            imageIndex = (imageIndex + 1) % castRight.length;
        }
        
        else
        {
            setImage(castLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % castLeft.length;
        }
    }
    
    public void castIt()
    {
        if (Greenfoot.isKeyDown("f"))
        {
            cast();
        }
    }*/
    
    /*public void move()
    {
        int dx = 0;
        if (Greenfoot.isKeyDown("d")) 
        {
            dx++;
            facing = "right";
            walk();
        }
        
        if (Greenfoot.isKeyDown("a")) 
        {
            dx--;
            facing = "left";
            walk();
        }
        
        setLocation(getX()+dx, getY());
        if (isTouching(Boundary.class))
        {
            setLocation(getX()-dx, getY());
        }
        
    }
    
    public void act()
    {
        int frame = 0;
        currentFrame = (currentFrame + 1) % 50;
        if (frame % 10 == 0) 
        {
            final int imageIndex = frame / 60;
            setImage(new GreenfootImage("images/castAni/cast" + imageIndex + ".png"));
            frame++;
        }&
        castIt();
        move();
    }*/
}
