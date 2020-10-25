import java.util.Scanner;

public class Square extends Shape implements Drawable{

    private float length;

    public Square(){
        this.readShape();
    }

    public Square(float l){
        length = l;
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
                return;
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid length!");
            }
        } while (!valid);
    }

    public void computeArea(){
        super.area = (float) (Math.pow(length,2));
    }

    public void computePerimeter(){
        super.perimeter = (float) (length * 4);
    }

    public void displayShape(){
        System.out.printf("Area of square = %.1f\n", area);
        System.out.printf("Perimeter of square = %.1f\n", perimeter);
    }

    public void draw(){
        Canvas canvas = Canvas.getCanvas();
        int position = (int) (Math.random() * 100);
        canvas.draw(this, "blue", new java.awt.Rectangle(position, position, (int)length, (int)length));
    }
}