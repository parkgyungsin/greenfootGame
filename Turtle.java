import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends TurtleMove implements Freezable
{
    private int counter = 100;
    private int counter_low = 0;
    public Turtle() 
    {
    }
    public void act() 
    {
        if(counter > 0){
          counter--;
          super.act();
        }
        
        else
        {
            if(counter_low + counter <= 100)
            {
                counter_low++;
            }
            else
            {
                counter_low = 0;
                counter = 100;
            }
        }
        eat();
    }
    
    public void freeze(int count)
    {
        counter = count;
    }
    
    public void eat()
    {
        if ( canSee(Lobster.class) )
        {
            eat(Lobster.class);
         }
    }
    } 