import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if (Greenfoot.isKeyDown("up"))
    {
        setLocation( getX(), getY() -3);
    }
    if (Greenfoot.isKeyDown("down"))
    {
        setLocation( getX(), getY() +3);
    }
    if (Greenfoot.isKeyDown("right"))
    {
        setLocation( getX() +3, getY() );
    }
    if (Greenfoot.isKeyDown("left"))
    {
        setLocation( getX() -3, getY() );
    }
    if (isTouching(Wall.class)){
        setLocation(20,20);
    }    
   if (isTouching(Block.class)){
        setLocation(20,20);
    }    
    }    
}
