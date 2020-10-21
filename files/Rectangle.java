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
       do {
           System.out.println("Please input the length:");
           Scanner input = new Scanner(System.in);
           if (input.hasNextFloat()) {
               length = input.nextFloat();
               valid = true;
           } else System.out.println("Invalid length!");
       } while (!valid);
       valid = false;
       do {
           System.out.println("Please input the width:");
           Scanner input = new Scanner(System.in);
           if (input.hasNextFloat()) {
               width = input.nextFloat();
               valid = true;
           } else System.out.println("Invalid width!");
       } while (!valid);
       this.computeArea();
       this.computePerimeter();
       this.displayShape();
   }
   public void computeArea(){
        area = length*width;
   }
   public void computePerimeter(){
        perimeter = 2*length+2*width;
   }
   public void displayShape(){
        System.out.printf("Area of rectangle = %.1f\n", area);
        System.out.printf("Perimeter of rectangle = %.1f\n", perimeter);
   }
   public void draw(){
       Canvas canvas = Canvas.getCanvas();
       int position = (int)(Math.random() * 100);
       canvas.draw(this, "blue", new java.awt.Rectangle(position, position, (int)length, (int)width));
   }
}
