import java.util.Random;

public class exercicio10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] matriz = new int[3][3];
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                matriz[i][j] = rand.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
