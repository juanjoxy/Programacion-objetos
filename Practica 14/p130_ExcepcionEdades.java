import java.util.InputMismatchException;
import java.util.Scanner;

public class p130_ExcepcionEdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] edades = new int[5];

        System.out.println("Captura las edades de 5 personas:");

        for (int i = 0; i < edades.length; i++) {
            boolean valido = false;
            while (!valido) {
                try {
                    System.out.print("Edad persona " + (i + 1) + ": ");
                    edades[i] = sc.nextInt();
                    valido = true;
                } catch (InputMismatchException e) {
                    System.out.println("Introduce un número entero");
                    sc.nextLine();
                }
            }
        }

        System.out.print("Captura terminada las edades son: ");
        for (int edad : edades) {
            System.out.print(edad + " ");
        }
        System.out.println();
    }
}
