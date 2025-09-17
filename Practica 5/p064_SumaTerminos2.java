import java.util.Scanner;

public class p064_SumaTerminos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos términos? ");
        int n = scanner.nextInt();

        int suma = 0;
        StringBuilder secuencia = new StringBuilder();

        int numero = 0;
        for (int i = 1; i <= n; i++) {
            numero = numero * 10 + 1;
            suma += numero;

            if (i == 1) {
                secuencia.append(numero);
            } else {
                secuencia.append("+").append(numero);
            }
        }

        System.out.println(secuencia.toString());
        System.out.println("suma " + suma);

        scanner.close();
    }
}
