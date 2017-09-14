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
        super(1024, 768, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ludzik ludzik = new Ludzik();
        addObject(ludzik,73,76);
        Ludzik ludzik2 = new Ludzik();
        addObject(ludzik2,222,178);
        Ludzik ludzik3 = new Ludzik();
        addObject(ludzik3,331,274);
        ludzik2.setLocation(446,106);
        ludzik3.setLocation(292,274);

        ludzik3.setLocation(354,409);
        ludzik3.setLocation(355,425);
        ludzik2.setLocation(439,452);
        ludzik.setLocation(519,473);
        ludzik3.setLocation(365,392);
        ludzik3.setLocation(345,353);
        ludzik2.setLocation(353,484);
        ludzik3.setLocation(398,365);
        ludzik2.setLocation(358,501);
        ludzik.setLocation(495,456);
        Ludzikv2 ludzikv2 = new Ludzikv2();
        addObject(ludzikv2,756,499);
        Ludzikv2 ludzikv22 = new Ludzikv2();
        addObject(ludzikv22,574,615);
        ludzikv22.setLocation(527,626);
        ludzikv2.setLocation(932,517);
        ludzikv22.setLocation(793,416);
        ludzikv22.setLocation(789,424);
        ludzikv2.setLocation(878,620);
        ludzik2.setLocation(359,526);
        ludzik.setLocation(481,450);
        ludzik2.setLocation(430,529);
        ludzik3.setLocation(372,400);
        removeObject(ludzikv22);
    }
}
