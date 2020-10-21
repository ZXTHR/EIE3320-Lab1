import java.util.Scanner;
import java.awt.geom.*;

public class Circle extends Shape implements Drawable {

    private float radius;

    public Circle(){
        this.readShape();
    }

    public Circle(float r){
        radius = r;
    }

    public void readShape(){
        boolean valid = false;
        do {
            System.out.println("Please input the radius:");
            Scanner input = new Scanner(System.in);
            if (input.hasNextFloat()) {
                radius = input.nextFloat();
                return;
            }
            else 
                System.out.println("Invalid radius!");
        } while (!valid);

    }

    public void computeArea(){
        super.area = (float) (Math.PI * (float)Math.pow(radius,2));
    }

    public void computePerimeter(){
        super.perimeter = (float) (Math.PI * 2 * radius);
    }

    public void displayShape(){
        System.out.printf("Area of circle = %f\n", area);
        System.out.printf("Perimeter of circle = %f\n", perimeter);
    }
    
    public void draw(){
        Canvas canvas = Canvas.getCanvas();
        int position = (int)Math.random() * 100;
        canvas.draw(this, "blue", new Ellipse2D.Double(position, position, (int)radius*2, (int)radius*2));
    }
}