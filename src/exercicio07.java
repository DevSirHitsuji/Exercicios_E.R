import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("put a number to calcule the factorial: ");
            int limit = scan.nextInt();
            int factorial = 1;
            
            for (int i = limit; i >= 1; i--){
                factorial = factorial * i;
            }

            System.out.println("The result is " + factorial);
        }
    }
}
