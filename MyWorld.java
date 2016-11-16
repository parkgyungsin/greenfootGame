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
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1);
        Crab myCrab;
        myCrab = new Crab();
        addObject( myCrab, 280, 280 );
        addObject( new Worm(), Greenfoot.getRandomNumber(493) + 34, Greenfoot.getRandomNumber(501) + 30);
        addObject( new Worm(), Greenfoot.getRandomNumber(493) + 34, Greenfoot.getRandomNumber(501) + 30);
        addObject( new Worm(), Greenfoot.getRandomNumber(493) + 34, Greenfoot.getRandomNumber(501) + 30);
        addObject( new Worm(), Greenfoot.getRandomNumber(493) + 34, Greenfoot.getRandomNumber(501) + 30);
        addObject( new Worm(), Greenfoot.getRandomNumber(493) + 34, Greenfoot.getRandomNumber(501) + 30);
        addObject( new Worm(), Greenfoot.getRandomNumber(493) + 34, Greenfoot.getRandomNumber(501) + 30);
        addObject( new Worm(), Greenfoot.getRandomNumber(493) + 34, Greenfoot.getRandomNumber(501) + 30);
        addObject( new Worm(), Greenfoot.getRandomNumber(493) + 34, Greenfoot.getRandomNumber(501) + 30);
        addObject( new Worm(), Greenfoot.getRandomNumber(493) + 34, Greenfoot.getRandomNumber(501) + 30);
        addObject( new Worm(), Greenfoot.getRandomNumber(493) + 34, Greenfoot.getRandomNumber(501) + 30);
        addObject( new Lobster(), Greenfoot.getRandomNumber(453) + 54, Greenfoot.getRandomNumber(453) + 54);
        addObject( new Turtle(), Greenfoot.getRandomNumber(453) + 54, Greenfoot.getRandomNumber(453) + 54);
        
    }
}
