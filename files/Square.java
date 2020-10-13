import java.util.Scanner;
public class Square extends Shape implements Drawable 
{
    private float length;
    public Square(){
        this.readShape();
    }
    public Square(float l){
        length = l;
    }
    public void readShape(){
        boolean valid = false;
        do {
            System.out.println("Please input the length:");
            Scanner input = new Scanner(System.in); //very low efficiency, wait redo
            if (input.hasNextFloat()) {
                length = input.nextFloat();
                valid = true;
            } else System.out.println("Invalid length!");
        } while (!valid);
        this.computeArea();
        this.computePerimeter();
        this.displayShape();
    }
    public void computeArea(){
        area = (float) Math.pow(length,2);
    }
    public void computePerimeter(){
        perimeter = length*4;
    }
    public void displayShape(){
        System.out.printf("Area of square = %.1f\n", area);
        System.out.printf("Perimeter of square = %.1f\n", perimeter);
    }
    public void draw(){
        Canvas canvas = Canvas.getCanvas();
        int position = (int)Math.random() * 100;
        canvas.draw(this, "blue", new java.awt.Rectangle(position, position, (int)length, (int)length));
    }
}
