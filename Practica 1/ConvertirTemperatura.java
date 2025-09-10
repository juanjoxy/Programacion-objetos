import java.util.Scanner;

public class ConvertirTemperatura {
    public static void main(String[] args) {
        Double fahrenheit, celsius;
        Scanner tinput = new Scanner(System.in);

        System.out.println("\nConvertir la temperatura de Fahrenheit a Celsius");
        System.out.print("Introduce la temperatura en grados Fahrenheit: ");
        fahrenheit = tinput.nextDouble();
        tinput.close();

        celsius =  (fahrenheit - 32) * 5 / 9;

        System.out.println(String.format("La temperatura en grados Celsius es}: %2f", celsius));

    }
}
