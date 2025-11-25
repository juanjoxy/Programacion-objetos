import java.util.Scanner;

public class p059_FactorialNumeros {
    public static void main(String[] args) {
        int i,j,n,f;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.print("¿Cuántos números? "); n = obj.nextInt();
        for(i=1; i<=n; i++) {
        System.out.printf("%d!=",i);
        f=1;
        for(j=1; j<=i; j++) {
        f *= j;

        }
        System.out.println(f);
        }
        System.out.print("\n¿Deseas continuar? (Sí/No)");
        resp=Character.toUpperCase(obj.next().charAt(0));
        } while( resp!= 'N');
        System.out.println("\nPrograma terminado. ");
    }
}
