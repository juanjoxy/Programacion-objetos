import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double n1, n2;
        char op;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Ejecuta operaciones matemáticas básicas con dos números:\n");
        System.out.print("Dame número 1:");
        n1 = obj.nextDouble();
        System.out.print("Dame número 2: ");
        n2 = obj.nextDouble();
        System.out.print("Elije la operación ( + - * / ^ ); ");
        op = obj.next().charAt(0);
        switch (op) {
        case '+':
        System.out.printf("n1 + n2 = %.2f", n1 + n2);
        break;
        case '-':
        System.out.printf("n1 - n2 = %.2f", n1 - n2);
        break;
        case '*':
        System.out.printf("n1 * n2 = %.2f", n1 * n2);
        break;
        case '/':
        System.out.printf("n1 / n2 = %.2f", n1 / n2);
        break;
        case '^':
        System.out.printf("n1 / n2 = %.2f", Math.pow(n1, n2));
        break;
        default:
        System.out.printf("\nOperación inválida ...");
        break;

        }
        System.out.println("\n\nProceso terminado ...");
    }
}
