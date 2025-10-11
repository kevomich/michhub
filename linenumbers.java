import java.util.Scanner;

public class linenumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 numbers: ");

        for (int i = 0; i < 5; i++){
            int num = scanner.nextInt();
            System.out.print(--num + " ");
        }
        scanner.close();
    }
    
}
