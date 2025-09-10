import java.util.Scanner;

public class CalculoTiempo {
    public static void main(String[] args) {
        double horas, dias, minutos, segundos;
        Scanner tinput = new Scanner(System.in);

        System.out.println("\nConvertir tiempo de horas a días, minutos y segundos.");
        System.out.print("Introduce el tiempo en horas: ");
        horas = tinput.nextDouble();
        tinput.close();

        dias = horas / 24;
        minutos = horas * 60;
        segundos = minutos * 60;

        System.out.println("\nEl tiempo de " + horas + " horas equivale a:");
        System.out.println(dias + " días");
        System.out.println(minutos + " minutos");
        System.out.println(segundos + " segundos\n");
    }
    
}
