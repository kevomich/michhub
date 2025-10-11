import java.util.Scanner;
public class ifelseif {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER STUDENT'S MARK: ");
        int num = scanner.nextInt();

        if(num >=0 && num <=39){
            System.out.println("FAIL");
        }else if(num >=40 && num <=49){
            System.out.println("PASS");
        }else if(num >=50 && num <=69){
            System.out.println("CREDIT");
        }else if(num >=70 && num <=100){
            System.out.println("DISTINCTION");
        }else{
            System.out.println("INVALID MARK!!!!");
        }
        scanner.close();
    }
    
}
