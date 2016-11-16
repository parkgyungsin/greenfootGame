import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TurtleMove here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TurtleMove extends Actor
{
    private static final double WALKING_SPEED = 1.0;
    /**
     * Act - do whatever the TurtleMove wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if ( atWorldEdge() ) 
        {
            turn(17);
        }

        if ( Greenfoot.getRandomNumber(100) < 10 ) 
        {
            turn( Greenfoot.getRandomNumber(90)-45 );
        }
        move();
    }
    
    public void move()
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() + Math.cos(angle) * WALKING_SPEED);
        int y = (int) Math.round(getY() + Math.sin(angle) * WALKING_SPEED);
        setLocation(x, y);
    }
    
    public void turn(int angle)
    {
        setRotation(getRotation() + angle);
    }
    
    public boolean atWorldEdge()
    {
        if(getX() < 20 || getX() > getWorld().getWidth() - 20)
            return true;
        if(getY() < 20 || getY() > getWorld().getHeight() - 20)
            return true;
        else
            return false;
    }
    
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
    
    public void eat(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
        }
    }
}
