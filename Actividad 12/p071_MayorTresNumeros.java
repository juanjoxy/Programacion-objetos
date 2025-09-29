import java.util.Scanner;

public class p071_MayorTresNumeros {

    public static float Mayor(float n1, float n2, float n3) {
        float may = n1;  

        if (n2 > may) may = n2;
        if (n3 > may) may = n3;

        return may;
    }

    public static void main(String[] args) {
        float n1, n2, n3;
        Scanner obj = new Scanner(System.in);

        // Limpiar pantalla (opcional)
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Dame tres números separados por espacio: ");
        n1 = obj.nextFloat();
        n2 = obj.nextFloat();
        n3 = obj.nextFloat();

        System.out.printf("\nEl mayor de los tres números es: %.2f\n", Mayor(n1, n2, n3));

        obj.close();
    }
}
