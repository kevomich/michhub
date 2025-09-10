import java.util.Scanner;
public class increment2 {
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);

        int output;

        System.out.println("ENTER INPUT");
        int inputInteger = inputScanner.nextInt();

        output = (++inputInteger -2)+3;

        System.out.println("\nOUTPUT IS: "+output);

        inputScanner.close();

    }
    
}
