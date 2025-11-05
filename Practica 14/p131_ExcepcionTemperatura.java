import java.util.InputMismatchException;
import java.util.Scanner;


class TemperaturaExcesiva extends Exception {
    public TemperaturaExcesiva(String mensaje) {
        super(mensaje);
    }
}

public class p131_ExcepcionTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Dame una temperatura en centigrados: ");
            double tempC = sc.nextDouble();

            double tempF = convertirAFarenheit(tempC);
            System.out.printf("%.2f grados centigrados, equivale a %.2f grados farenheit%n", tempC, tempF);
        } 
        catch (InputMismatchException e) {
            System.out.println("La teperatura a convertir, debe ser un valor numérico");
        } 
        catch (TemperaturaExcesiva e) {
            System.out.println("Error : " + e);
        }
    }

    public static double convertirAFarenheit(double tempC) throws TemperaturaExcesiva {
        if (tempC > 100) {
            throw new TemperaturaExcesiva("Temperatura demasiado alta, no se puede convertir");
        }
        return (tempC - 32) * 5 / 9;
    }
}
