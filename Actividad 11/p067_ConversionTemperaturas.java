import java.util.Scanner;

public class p067_ConversionTemperaturas {

    public static float Farenheit(float t) {
        return (t * 9 / 5) + 32;
    }

    public static float Celsius(float t) {
        return (t - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        int op;
        float temp, res;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("[1] Convertir de Celsius a Fahrenheit\n");
        System.out.print("[2] Convertir de Fahrenheit a Celsius\n");
        System.out.print("Elige una opción: ");
        op = obj.nextInt();

        if (op == 1) {
            System.out.print("Dame la temperatura en grados Celsius: ");
            temp = obj.nextFloat();
            res = Farenheit(temp);
            System.out.printf("\n%.2f grados Celsius equivale a %.2f grados Fahrenheit.\n", temp, res);
        } else if (op == 2) {
            System.out.print("Dame la temperatura en grados Fahrenheit: ");
            temp = obj.nextFloat();
            res = Celsius(temp);
            System.out.printf("\n%.2f grados Fahrenheit equivale a %.2f grados Celsius.\n", temp, res);
        } else {
            System.out.println("Opción inválida.");
        }

        obj.close(); 
    }
}
