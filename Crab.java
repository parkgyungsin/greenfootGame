import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Animal
{
    private int wormsEaten;
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeypress();
        eat();  
    }
    
    public void checkKeypress()
    {
        if ( Greenfoot.isKeyDown("left") )
        {
            turn(-6);
        }
        if ( Greenfoot.isKeyDown("right") )
        {
            turn(6);
        }
        if ( Greenfoot.isKeyDown("up") )
        {
            move(); 
        }
        if ( Greenfoot.isKeyDown("down") )
        {
            turn(180);
            move();
            turn(-180);
        }
    }
    public void animateCrab(){
    if (canSee(Lobster.class))
        {
            Greenfoot.stop();
        }
    }
     public void eat()
    {
        if ( canSee(Worm.class) )
        {
            eat(Worm.class);
            wormsEaten = wormsEaten + 1;
           
            if (wormsEaten % 10 == 0)
            {
                reSpawn();
            }
        }
    }
    
    public void reSpawn()
    {
        getWorld().addObject( new Worm(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        getWorld().addObject( new Worm(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        getWorld().addObject( new Worm(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        getWorld().addObject( new Worm(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        getWorld().addObject( new Worm(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        getWorld().addObject( new Worm(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        getWorld().addObject( new Worm(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        getWorld().addObject( new Worm(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        getWorld().addObject( new Worm(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        getWorld().addObject( new Worm(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        getWorld().addObject( new Lobster(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
    }
}
