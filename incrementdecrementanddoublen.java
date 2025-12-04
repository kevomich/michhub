import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class incrementdecrementanddoublen {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );

        System.out.println("enter number(n): ");

        int n = Integer.parseInt(reader.readLine());

        n += 1;
        n -=2;
        n = n * 2;

        System.out.println("output is "+n);

    }
}
