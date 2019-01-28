
/**
 * Write a description of class mypicture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mypicture
{
    // instance variables - replace the example below with your own
    private Square wall;
    private Square window;
    private Triangle nose;
    private Circle sun;
    private Circle eye;
    private Circle eye2;
    private Circle mouth;
    private boolean drawn;

    /**
     * Constructor for objects of class mypicture
     */
    public mypicture()
    {
        // initialise instance variables
        wall = new Square();
        window = new Square();
        nose = new Triangle();  
        sun = new Circle();
        eye = new Circle();
        eye2 = new Circle();
        mouth = new Circle();
        drawn = false;
    }

  public void draw()
    {
        if(!drawn) {
            sun.changeColor("yellow");
            sun.moveHorizontal(-25);
            sun.moveVertical(0);
            sun.changeSize(200);
            sun.makeVisible();
            drawn = true;
            
            eye.changeColor("black");
            eye.moveHorizontal(0);
            eye.moveVertical(45);
            eye.changeSize(25);
            eye.makeVisible();
            drawn = true; 
            
            eye2.changeColor("black");
            eye2.moveHorizontal(125);
            eye2.moveVertical(45);
            eye2.changeSize(25);
            eye2.makeVisible();
            drawn = true;          
            
            mouth.changeColor("black");
            mouth.moveHorizontal(85);
            mouth.moveVertical(-100);
            mouth.changeSize(35);
            mouth.makeVisible();
            drawn = true;  
            
            nose.changeColor("black");
            nose.moveHorizontal(-200);
            nose.moveVertical(0);
            nose.makeVisible();
            drawn = true;                  
        }
    }
}
