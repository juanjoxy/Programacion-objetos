import java.util.Scanner;

public class p075_CuadroCaracter {

    public static void Cuadro(int ren, int col, char car) {
        for (int i = 1; i <= ren; i++) {
            for (int j = 1; j <= col; j++)
                System.out.printf("%c ", car);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int ren, col;
        char car;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        do {
            System.out.print("Renglones (positivo)? ");
            ren = obj.nextInt();
            if (ren <= 0) {
                System.out.println("Por favor ingresa un número positivo.");
            }
        } while (ren <= 0);

        do {
            System.out.print("Columnas (positivo)? ");
            col = obj.nextInt();
            if (col <= 0) {
                System.out.println("Por favor ingresa un número positivo.");
            }
        } while (col <= 0);

        System.out.print("Caracter? ");
        car = obj.next().charAt(0);

        Cuadro(ren, col, car);

        obj.close();
    }
}
