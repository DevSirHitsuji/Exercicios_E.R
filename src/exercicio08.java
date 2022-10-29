import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            int[] listNumbers = new int[6];

            for (int i = 0; i <= 5; i++){
                System.out.println("Put the number relative a position " + (i+1) + " of list: ");
                listNumbers[i] = scan.nextInt();
            }
            System.out.println("The reverse list is: ");
            for (int i = 6; i >= 1; i--){
                System.out.println(listNumbers[i-1]);
            }
        }


    }
}
