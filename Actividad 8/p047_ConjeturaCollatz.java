import java.util.Scanner;

public class p047_ConjeturaCollatz {
    public static void main(String[] args) {
        int n;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Imprime la conjetura de Collatz para un número entero positivo.\n");
        do {
        System.out.print("Dame un número que sea positivo: ");
        n = obj.nextInt();
        } while( n < 0);
        do {
        System.out.printf("%d ",n);
        if( n%2 == 0)
        n = n / 2;
        else
        n = n * 3 + 1;
        } while(n != 1);
        System.out.printf("%d ", n);
        System.out.print("\n¿Quieres continuar? (Sí/No) ");resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nEl proceso ha terminado.");
    }
}
