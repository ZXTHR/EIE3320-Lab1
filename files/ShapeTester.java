import java.util.Scanner;

public class ShapeTester
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shape shape;
        String inputValue;
        Boolean running = true;
        do{
            showMenu();
            inputValue = input.nextLine();
            if (inputValue.length() != 1){
                System.out.println("Invalid command!");
            } else {
                switch (inputValue){
                    case "c": 
                            showInfo(new Circle());
                            break;
                    case "s": 
                            showInfo(new Square());
                            break;
                    case "r": 
                            showInfo(new Rectangle());
                            break;
                    case "x": 
                            System.exit(0);
                    default:  
                            System.out.println("Invalid command!"); 
                            break;
                }
            }
        } while (running);
    }

    public static void showMenu(){
            System.out.println("\n**************************************");
            System.out.println("* Please choose one the followings:  *");
            System.out.println("* Press 'c' - Circle                 *");
            System.out.println("* Press 's' - Square                 *");
            System.out.println("* Press 'r' - Rectangle              *");
            System.out.println("* Press 'x' - EXIT                   *");
            System.out.println("**************************************\n");
    }

    public static void showInfo(Shape s){
            s.computeArea();
            s.computePerimeter();
            s.displayShape();
            ((Drawable)s).draw();
    }
}
