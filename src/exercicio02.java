import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            while (true){
                System.out.println("digite seu usuario: ");
                String usuario = scan.nextLine().toString();
                System.out.println("digite sua senha: ");
                String senha = scan.nextLine().toString();
                
                if (senha.equalsIgnoreCase(usuario)){
                    System.out.println("senha igual ao usuario, tente novamente");
                }else{
                    break;
                }
            }
            System.out.println("Cadastro feito com sucesso!");
        }  
    }
}
