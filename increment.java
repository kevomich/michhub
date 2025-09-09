import java.util.Scanner;

public class increment {
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("enter input value: ");

        int inputInteger = inputScanner.nextInt();
        
        System.out.println((++inputInteger -2)+3);


        inputScanner.close();


    }
}
