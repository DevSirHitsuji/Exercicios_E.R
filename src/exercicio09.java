import java.util.Scanner;
import java.util.Random;

public class exercicio09 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            Random random = new Random();
            int[] randomNumbs = new int[20];
            
            for (int i = 0; i < randomNumbs.length; i++){
                int number = random.nextInt(100);
                randomNumbs[i] = number;
            }

            for (int number : randomNumbs){
                System.out.println("The successor of " + number + " is: " + (number-1));
            }
        }
    }
}
