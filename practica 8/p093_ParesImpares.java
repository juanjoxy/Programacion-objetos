import java.util.Random;

public class p093_ParesImpares {
    public static void main(String[] args) {
        final int MAX = 100;
        int[] a = new int[MAX];
        int[] b = new int[MAX];

        Random rand = new Random();

        for (int i = 0; i < MAX; i++) {
            a[i] = rand.nextInt(21); 
        }

        System.out.println("Elementos del arreglo a:");
        for (int i = 0; i < MAX; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int contadorPares = 0;
        System.out.println("\nElementos pares:");
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                contadorPares++;
            }
        }
        System.out.println("\nCantidad de números pares: " + contadorPares);

        int contadorImpares = 0;
        System.out.println("\nElementos impares:");
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
                contadorImpares++;
            }
        }
        System.out.println("\nCantidad de números impares: " + contadorImpares);
    }
}
