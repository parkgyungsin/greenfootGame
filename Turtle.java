import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends TurtleMove implements Freezable
{
    private int counter;
    public Turtle()
    {
        counter = 100;
    }
    public void act() 
    {
        if( counter <= 0 ){
        super.act();
    }
        else{
        counter--;
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