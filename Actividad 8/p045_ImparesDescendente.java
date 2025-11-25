import java.util.Scanner;

public class p045_ImparesDescendente {
    public static void main(String[] args) {
        int n,c,s;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Imprime números impares descendente.\n");
        System.out.print("¿Desde donde empieza? "); n = obj.nextInt();
        s=0;c=( n%2==0 ? --n : n);
        while( c>=1 ) {
        System.out.printf("%d ",c);
        s = s + c;
        c = c - 2;
        }
        System.out.printf("\nLa suma es: %d",s);
        System.out.print("\n¿Quieres continuar? (Simona/Nel) "); resp = Character.toUpperCase(obj.next().charAt(0));
        } while( resp != 'N' );
        System.out.println("\nGracias por usar el programita.");
    }
}
