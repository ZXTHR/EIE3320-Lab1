/**
 * Circle.java
 *
 * @author: Ku Wing Fung 18075712d
 * @author: Wong Tsz Hin 18050573d
 *
 * 
 */

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
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("Please input the radius:");
                radius = Float.parseFloat(input.next());
                if (radius <= 0) {
                    System.out.println("Invalid radius!");
                } else 
                    return;
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid radius!");
            }
        } while (!valid); //Avoid using while(1) or while(true) because it is bad practice
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
        int posX = (int) (Math.random() * 100);
        int posY = (int) (Math.random() * 100);
        canvas.draw(this, "blue", new Ellipse2D.Double(posX, posY, (int)radius*2, (int)radius*2));
    }
}