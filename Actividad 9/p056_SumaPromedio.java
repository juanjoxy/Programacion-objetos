import java.util.Scanner;

public class p056_SumaPromedio {
    public static void main(String[] args) {
        int n;
        float cal, suma, prom;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
        System.out.print("\033[H\033[2J");System.out.flush();
        suma=prom=0;
        System.out.println("Suma y promedio de calificaciones: \n");
        System.out.print("¿Cuántas calificaciones? "); n = obj.nextInt();
        for(int i=1; i<=n; i++) {
        System.out.printf("Calificación; %d ",i);
        cal=obj.nextFloat();
        suma+=cal;
        }
        prom=suma/n;
        System.out.printf("\nSuma es: %.2f y el promedio es: %.2f\n\n",suma,prom);
        System.out.print("¿Deseas continuar? (Imon/Non) ");
        resp = Character.toUpperCase(obj.next().charAt(0));
        } while( resp != 'N');
        System.out.println("\nY se acabó.");
    }
}
