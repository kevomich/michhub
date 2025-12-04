import java.util.Scanner;
public class doublecalculations {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double x;

        System.out.println("ENTER x: ");
        x = scanner.nextDouble();

        double result = (x*x*x) + (x*x) + x + 1;
        System.out.println("result is "+result);


        scanner.close();
    }

    
}
