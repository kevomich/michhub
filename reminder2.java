import java.util.Scanner;
public class reminder2 {
    public static void main(String[] args){
        double result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("************CALCULATOR************\n");

        System.out.println("ENTER OPERATOR '+' OR '-' OR '*' OR '/' ");
        char op = scanner.next().charAt(0);

        System.out.println("ENTER FIRST NUMBER");
        int NUM1 = scanner.nextInt();

        System.out.println("ENTER SECOND NUMBER");
        int NUM2 = scanner.nextInt();

        switch(op){
            case '+' :
              result = NUM1 + NUM2;
              System.out.println("result is: "+result);
              break;

            case '-' :
              result = NUM1 - NUM2;
              System.out.println("result is: "+result);
              break;
              
            case '*' :
              result = NUM1 * NUM2;
              System.out.println("result is: "+result);
              break;
              
            case '/' :
              result = NUM1 / NUM2;
              System.out.println("result is: "+result);
              break;
             
            default :
               System.out.println("invalid operator!!!!!");

              
        }
        scanner.close();

        System.out.println("\n**************CALCULATOR*************");

    }
    
}
