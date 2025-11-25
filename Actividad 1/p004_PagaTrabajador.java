import java.util.Scanner;

public class p004_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga, tasa, impuesto, pagabruta, paganeto;
        Scanner obj = new Scanner(System.in);
        System.out.print("Nombre del trabajador: "); nombre = obj.nextLine();
        System.out.print("Horas trabajadas: "); horas = obj.nextInt();
        System.out.print("Paga por hora:  "); paga = obj.nextFloat();
        tasa = 0.03; 
        pagabruta = horas * paga;
        impuesto = pagabruta * tasa;
        paganeto = pagabruta - impuesto;
        System.out.println("\nResumen de pagas\n");
        System.out.println(String.format("El trabajador %s, trabajó %d horas, a una paga de %.2f pesos la hora, con una tasa de impuesto de %.2f",nombre, horas, paga, tasa));
        System.out.println(String.format("Paga bruta    = %.2f", pagabruta));
        System.out.println(String.format("Impuestos     = %.2f", impuesto));
        System.out.println(String.format("Paga neto     = %.2f", paganeto));
    
    }
}
