import java.util.Scanner;

public class system {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score......");
        int score = scanner.nextInt();

        if(score<= 0 ){
            System.out.println("you are an amateur");   
        }else if(score > 1 && score < 3){
            System.out.println("beginner");
        }else if(score > 3 && score < 5){
            System.out.println("you are a semi-pro");
        }else{
            System.out.println("you are a pro");
        }
    scanner.close();
   }
}
    
