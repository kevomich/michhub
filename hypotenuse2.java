import java.util.Scanner;
public class hypotenuse2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Enter side a");
        a = scanner.nextDouble();

        System.out.println("Enter side b");
        b = scanner.nextDouble();

        c = Math.sqrt((a*a)+(b*b));
        System.out.println("The hypotenuse is "+c);

       
       scanner.close();
       
    }
    
}
