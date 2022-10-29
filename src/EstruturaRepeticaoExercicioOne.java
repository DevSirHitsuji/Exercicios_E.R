import java.util.Scanner;

public class EstruturaRepeticaoExercicioOne {

    public static void main(String[] args) {
        exercicioOne();
    }

    public static void exercicioOne(){
        double entrada = entradaComValidacao();
        System.out.println("valor de entrada: " + entrada);
    }

    public static double entradaComValidacao(){
        try (Scanner scan = new Scanner(System.in)) {
            while (true){
                System.out.println("Digite sua nota: ");
                double entrada = scan.nextDouble();
                if (entrada >= 0 && entrada <= 10) {
                    return entrada;
                }
                else{
                    System.out.println("valor inválido, insira novamente!");
                }
            }
        }

    }
}
