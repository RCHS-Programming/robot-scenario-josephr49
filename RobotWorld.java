import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall = new Wall();
        addObject(wall,53,167);
        Wall wall2 = new Wall();
        addObject(wall2,158,166);
        Wall wall3 = new Wall();
        addObject(wall3,256,166);
        Block block = new Block();
        addObject(block,434,164);
        Wall wall4 = new Wall();
        addObject(wall4,610,176);
        Wall wall5 = new Wall();
        addObject(wall5,711,181);
        wall5.setLocation(762,179);
        Wall wall6 = new Wall();
        addObject(wall6,762,179);
        Robot robot = new Robot();
        addObject(robot,54,52);
        Pizza pizza = new Pizza();
        addObject(pizza,270,53);
        Pizza pizza2 = new Pizza();
        addObject(pizza2,720,56);
        Pizza pizza3 = new Pizza();
        addObject(pizza3,235,315);
        Pizza pizza4 = new Pizza();
        addObject(pizza4,717,307);
        Pizza pizza5 = new Pizza();
        addObject(pizza5,448,473);
        Home home = new Home();
        addObject(home,717,521);
        Scorepanel scorepanel = new Scorepanel();
        addObject(scorepanel,103,512);
        wall5.setLocation(710,176);
        Wall wall7 = new Wall();
        addObject(wall7,710,176);
    }
}
