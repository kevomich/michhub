import java.util.Scanner;
public class linenumbers2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers: ");
        String input = scanner.nextLine();

        String[] parts = input.split(" ");

        for (String part : parts){
            int num = Integer.parseInt(part);
            System.out.print(++num + " ");
        }

        scanner.close();

    }

    
}