import java.util.Scanner;

public class p073_SumaParesImpares {

    public static int SumaParImpar(int ini, int fin, char letra) {
        int suma = 0;
        System.out.print("Números " + (letra == 'P' ? "pares: " : "impares: "));
        for (int i = ini; i <= fin; i++) {
            if (letra == 'P' && i % 2 == 0) {
                System.out.print(i + " ");
                suma += i;
            } else if (letra == 'I' && i % 2 != 0) {
                System.out.print(i + " ");
                suma += i;
            }
        }
        System.out.println();
        return suma;
    }

    public static void main(String[] args) {
        int ini, fin, suma;
        char poi;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        do {
            System.out.print("Valor inicial ? ");
            ini = obj.nextInt();
            System.out.print("Valor final ? ");
            fin = obj.nextInt();

            if (ini > fin) {
                System.out.println("El valor inicial debe ser menor o igual al valor final. Inténtalo de nuevo.\n");
            }
        } while (ini > fin);

        do {
            System.out.print("\n[P]ares \n[I]Impares ? ");
            poi = Character.toUpperCase(obj.next().charAt(0));
            if (poi != 'P' && poi != 'I') {
                System.out.println("Opción inválida, por favor ingresa 'P' o 'I'.");
            }
        } while (poi != 'P' && poi != 'I');

        suma = SumaParImpar(ini, fin, poi);
        System.out.printf("\nLa suma es : %d\n", suma);

        obj.close();
    }
}
