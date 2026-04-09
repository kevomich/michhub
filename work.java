import java.util.Scanner;

public class work {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your marks");
        int marks = scanner.nextInt();

        switch(marks /10){
            case 0: case 1: case 2: case 3: 
                System.out.println("your score is Fail");
                break;

            case 4:  
                System.out.println("your score is pass");
                break;
                
            case 5: case 6: case 7: 
                System.out.println("your score is credit");
                break;  
                
            case 8: case 9: case 10:
                System.out.println("your score is distinction");
                break;  

            default:
                System.out.println("invalid input!!!!!");    

        }


    scanner.close();
    }
    
}
