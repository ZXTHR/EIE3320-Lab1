import java.util.Scanner;

public class ShapeTester
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shape s;
        String inputvalue;
        char userinput = 'n';
        do{
            System.out.println();
            System.out.println("**************************************");
            System.out.println("* Please choose one the followings:  *");
            System.out.println("* Press 'c' - Circle                 *");
            System.out.println("* Press 's' - Square                 *");
            System.out.println("* Press 'r' - Rectangle              *");
            System.out.println("* Press 'x' - EXIT                   *");
            System.out.println("**************************************");
            System.out.println();
            inputvalue = input.nextLine();
            if (inputvalue.length() != 1){
                System.out.println("Invalid command!");
            } else {
                userinput = inputvalue.charAt(0);
                switch (userinput){
                    case 'c': s = new Circle();
                            s.draw();
                            break;
                    case 's': s = new Square();
                            s.draw();
                            break;
                    case 'r': s = new Rectangle();
                            s.draw();
                            break;
                    case 'x': break;
                    default:  System.out.println("Invalid command!"); 
                            break;
                }
            }
        } while (!(userinput=='x'));
    }
}
