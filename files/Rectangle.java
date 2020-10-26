/**
 * Rectangle.java
 *
 * @author: Ku Wing Fung 18075712d
 * @author: Wong Tsz Hin 18050573d
 *
 * 
 */
import java.util.Scanner;
public class Rectangle extends Shape implements Drawable 
{
   private float length;
   private float width;

   public Rectangle(){
       this.readShape();
   }

   public Rectangle(float l, float w){
       length = l;
       width = w;
   }
   public void readShape(){
       boolean valid = false;
       Scanner input = new Scanner(System.in);

       do {
           try {
           System.out.println("Please input the length:");
           length = Float.parseFloat(input.next());
           if (length <= 0) {
               System.out.println("Invalid length!");
           } else 
               valid = true;
           }
           catch (NumberFormatException e) {
               System.out.println("Invalid length!");
           }
       } while (!valid);

       valid = false;

       do {
           try {
           System.out.println("Please input the width:");
           width = Float.parseFloat(input.next());
           if (width <= 0) {
               System.out.println("Invalid width!");
           } else 
               return;
           }
           catch (NumberFormatException e) {
               System.out.println("Invalid width!");
           }
       } while (!valid);  //Avoid using while(1) or while(true) because it is bad practice
   }

   public void computeArea(){
        super.area = (float) (length * width);
   }

   public void computePerimeter(){
        super.perimeter = (float) (length * 2 + width * 2);
   }

   public void displayShape(){
        System.out.printf("Area of rectangle = %.1f\n", area);
        System.out.printf("Perimeter of rectangle = %.1f\n", perimeter);
   }

   public void draw(){
       Canvas canvas = Canvas.getCanvas();
       int posX = (int) (Math.random() * 100);
       int posY = (int) (Math.random() * 100);
       canvas.draw(this, "blue", new java.awt.Rectangle(posX, posY, (int)length, (int)width));
   }
}
