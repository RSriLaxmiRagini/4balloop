import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int Diameter = 10;
    int x=0,y=0,z=0,a=0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);

    }

    @Override
    public void settings() {
        super.settings();
        size(640,480);
    }

    @Override
    public void setup() {
       // System.out.println("Print from setup");
        //ellipse(WIDTH/2,HEIGHT/2,100,100);
    }

    @Override
    public void draw() {
        ellipse(x, 480/5, 10,10);
        x++;
        ellipse(y, 2*(480/5), 10,10);
        y+=2;
        ellipse(z, 3*(480/5), 10,10);
        z+=3;
        ellipse(a, 4*(480/5), 10,10);
        a+=4;

    }

}
