import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            System.err.println("Put a integer number, please: ");
            int number = scan.nextInt();

            if (number%2 == 0) {
                System.out.println("The number is pair!");
            }else{
                System.out.println("The number is odd!");
            }
        }        
    }
}
