import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num1 = scan.nextInt();
        scan.nextLine();

        System.out.print("Digite outro numero: ");
        int num2 = scan.nextInt();
        scan.nextLine();

        System.out.print("Digite o operador matematico desejado (+, -, *, /): ");
        String oper = scan.nextLine();

        switch (oper) {
            case "+":
                int soma = num1 + num2;
                System.out.printf("O resultado de %d + %d é igual a %d", num1, num2, soma);
                break;
            case "-":
                int sub = num1 - num2;
                System.out.printf("O resultado de %d - %d é igual a %d", num1, num2, sub);
                break;
            case "*":
                int mult = num1 * num2;
                System.out.printf("O resultado de %d * %d é igual a %d", num1, num2, mult);
                break;
            case "/":
                int div = num1 / num2;
                System.out.printf("O resultado de %d / %d é igual a %d", num1, num2, div);
                break;
            default:
                System.out.print("Operador inválido");
                break;
        }

    }
}