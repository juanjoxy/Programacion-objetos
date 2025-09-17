import java.util.Scanner;

public class p063_SumaTerminos1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos términos? ");
        int n = scanner.nextInt();

        double suma = 0.0;
        StringBuilder secuencia = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            suma += 1.0 / i;

            if (i == 1) {
                secuencia.append("1");
            } else {
                secuencia.append("+1/").append(i);
            }
        }

        System.out.println("Salida: " + secuencia.toString());
        System.out.println("Suma " + suma);

        scanner.close();
    }
}
