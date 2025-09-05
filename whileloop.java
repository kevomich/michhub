import java.util.Scanner;
public class whileloop{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = 0;


        while(n>=0 && n<=10){
            System.out.println("enter n: ");
            n = scanner.nextInt();

        }
       scanner.close();


    }
}