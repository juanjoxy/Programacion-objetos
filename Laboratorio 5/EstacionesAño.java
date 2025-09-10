import java.util.Scanner;

public class EstacionesAño {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Muestra la estación del año en base al número:\n");
        System.out.print("Dame un número (1..4) ? ");
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 1) System.out.println("Primavera");
        else if (n == 2) System.out.println("Verano");
        else if (n == 3) System.out.println("Otoño");
        else if (n == 4) System.out.println("Invierno");
        else System.out.println("Estación incorrecta");
        
        System.out.println("\nProceso terminado ....");
        
        scanner.close();
    }
}

