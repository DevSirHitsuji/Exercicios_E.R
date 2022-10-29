public class exercicio06 {
    public static void main(String[] args) {
        for(float number1 = 1; number1 <= 10; number1++){
            for(float number2 = 1; number2 <= 10; number2++){
                System.out.print(number1 + " + " + number2 + ": " + (number1+number2));
                System.out.print("    " + number1 + " x " + number2 + ": " + (number1*number2));
                System.out.print("    " + number1 + " % " + number2 + ": " + (number1/number2) + "\n");
            }
            System.out.println("\n");
        }
    }
}
