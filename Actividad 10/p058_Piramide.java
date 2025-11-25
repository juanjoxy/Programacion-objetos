import java.util.Scanner;

public class p058_Piramide {
    public static void main(String[] args) {
        int i,j,n;
        char car, resp;
        Scanner obj = new Scanner(System.in);
        do {
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.print("¿Cuántos renglones necesitas? "); n = obj.nextInt();
        System.out.print("¿De qué caracter? "); car = obj.next().charAt(0);
        for(i=1; i<=n; i++) {
        for(j=1; j<=i; j++) {

        System.out.print(car);

        }
        System.out.println();
        }
        System.out.print("\n¿Deseas continuar? (Sí/No)");
        resp=Character.toUpperCase(obj.next().charAt(0));
        } while( resp!= 'N');
        System.out.println("\nEste programa se ha terminado.");
    }
}
