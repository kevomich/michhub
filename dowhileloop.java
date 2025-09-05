import java.util.Scanner;

public class dowhileloop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int difficulty;

        do {
            System.out.println("Enter difficulty level (1-3): ");
            difficulty = scanner.nextInt();

        }while (difficulty < 1 || difficulty > 3);

        System.out.println("You selected difficulty level: " + difficulty);
        scanner.close();
        
    }
    
}
