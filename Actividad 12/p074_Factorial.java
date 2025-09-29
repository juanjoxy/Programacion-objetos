import java.util.Scanner;

public class p074_Factorial {

    public static double Factorial(int n) {
        double f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        int n;
        do {
            System.out.print("Dame un número (>= 0): ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Error: El número debe ser mayor o igual a cero.");
            }
        } while (n < 0);

        System.out.printf("\nEl factorial de %d es %.0f\n", n, Factorial(n));

        scanner.close();
    }
}
