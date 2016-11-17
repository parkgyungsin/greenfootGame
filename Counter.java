import greenfoot.*;
import java.awt.Color;
 
public class Counter  extends Actor
{
    int score = 0;
    public void act()
    {
        setImage(new GreenfootImage("Score : " + score, 24, Color.GREEN, Color.YELLOW));
    }
    
    public void addScore()
    {
        score = score + 10;
    }
}