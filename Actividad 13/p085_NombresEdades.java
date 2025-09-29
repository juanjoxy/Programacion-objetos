import java.util.Scanner;

public class p085_NombresEdades {
    public static void main(String[] args) {
        int n, sumaEdades = 0, promedio = 0;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("¿Cuántos nombres deseas procesar? ");
        n = obj.nextInt();
        obj.nextLine(); 

        String[] nombres = new String[n];
        int[] edades = new int[n];

        System.out.printf("Dame los %d nombres y sus edades:\n", n);

        for (int i = 0; i < n; i++) {
            System.out.printf("Dame el nombre %d: ", i + 1);
            nombres[i] = obj.nextLine();

            System.out.printf("Dame su edad: ");
            edades[i] = obj.nextInt();
            obj.nextLine(); 
        }

        System.out.println("\nLos nombres capturados son:\n");
        System.out.printf("Nombre\tEdad\n");

        for (int i = 0; i < n; i++) {
            System.out.printf("%s\t%d\n", nombres[i], edades[i]);
            sumaEdades += edades[i];
        }

        promedio = sumaEdades / n;

        System.out.printf("\nEl promedio de edades es %d\n", promedio);

        obj.close();
    }
}
