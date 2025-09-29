import java.util.Scanner;

public class p070_CalificacionLetra {

    public static char CalifLetra(float cal) {
        char letra = ' ';
        if (cal >= 90 && cal <= 100)
            letra = 'A';
        else if (cal >= 80 && cal < 90)
            letra = 'B';
        else if (cal >= 70 && cal < 80)
            letra = 'C';
        else if (cal >= 60 && cal < 70)
            letra = 'D';
        else if (cal >= 0 && cal < 60)
            letra = 'F';

        return letra;
    }

    public static void main(String[] args) {
        float cal;
        char letra;
        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        do {
            System.out.print("Dame tu calificación (0-100): ");
            cal = scanner.nextFloat();
            if (cal < 0 || cal > 100) {
                System.out.println("Calificación inválida, intenta de nuevo.");
            }
        } while (cal < 0 || cal > 100);

        letra = CalifLetra(cal);
        System.out.printf("\nTu calificación de %.2f en letra es %c\n", cal, letra);

        scanner.close();
    }
}
