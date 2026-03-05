 import java.util.Scanner;

public class numberdeterminer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nenter number:");
        String num = scanner.nextLine();
       try{
        int number = Integer.parseInt(num);

        if(number <0){
            System.out.println("negative");
        }else if(number >0){
            System.out.println("positive");
        }else
            System.out.println("zero");
        }catch (NumberFormatException e) {
            // If parsing as integer fails, it's a non-integer
            System.out.println("non-integer");
       }
       scanner.close(); 
    }
    
}
