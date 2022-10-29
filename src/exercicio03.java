import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            while (true){
                System.out.println("Input your note: ");
                float note = scan.nextFloat();
                
                if (note >= 0 && note <= 10){
                    break;
                }else{
                    System.out.println("Input invalid, try again!");
                }
            }
        }       
    }
}
