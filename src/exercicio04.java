import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            float average = 0;
            for (int i = 1; i <= 5; i++){
                System.out.println("Input your "+ i + " note: ");
                float nota = scan.nextFloat();
                average = average + nota;
            }
            average = (average / 5);
            System.out.println("Your avarege note is " + average);
        }
    }
}
