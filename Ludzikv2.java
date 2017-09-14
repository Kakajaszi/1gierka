import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ludzikv2 extends Actor
{
    private void klawisze()
    {
        if(Greenfoot.isKeyDown("right") ) move(2);
        if(Greenfoot.isKeyDown("left") ) move(-2);
        if(Greenfoot.isKeyDown("up") ) 
        {
            turn(-90);
            move(2);
            turn(90);
        }
        if(Greenfoot.isKeyDown("down") ) 
        {
            turn(-90);
            move(-2);
            turn(90);
        }
    }

    private void zjadanie()
    {
        //jezeli dotykam tt usun go
        if(isTouching(Ludzik.class) ) 
        removeTouching(Ludzik.class) ; 
    }

    /**
     * Act - do whatever the Ludzikv2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        // Add your action code here.
        klawisze();
        zjadanie();
    }    
}
