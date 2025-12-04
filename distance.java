import java.util.Scanner;
public interface distance {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double distance;
        double time;

        System.out.println("Enter distance");
        distance = scanner.nextDouble();

        System.out.println("Enter time");
        time = scanner.nextDouble();

        double speed = distance / time;

        System.out.println("speed is "+ speed +" miles/hour");

        scanner.close();

    }
}
