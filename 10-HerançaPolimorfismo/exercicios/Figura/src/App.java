
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();
        char op ;

        System.out.println("Enter the number of shapes:");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++){
            System.out.println("Shape # %d data:"+ i + 1);

            System.out.println("RectangleorCircle(r/c)? ");
            op = sc.next().charAt(0);

            System.out.println(" Color (BLACK/BLUE/RED): ");
            String color = sc.next();

         } if (op == "r"){

            System.out.println(" Width:  ");
            double width = sc.nextDouble();
            System.out.println(" Height:  ");
            double  height = sc.nextDouble();

            list.add(new Rectangle(width,height));

            }else {
            System.out.println("Radius:  ");
            double radius = sc.nextDouble();

            list.add(new Circle ( radius));
            }

    
        }
    }

