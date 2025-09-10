import java.util.Scanner;

public class VolumenCilindro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el radio del cilindro: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingresa la altura del cilindro: ");
        double altura = scanner.nextDouble();

        if (radio <= 0 || altura <= 0) {
            System.out.println("El radio y la altura deben ser valores positivos.");
        } else {
            double volumen = Math.PI * (radio * radio) * altura;

            System.out.printf("El volumen del cilindro es: %.2f unidades cúbicas\n", volumen);
        }

        scanner.close();
    }
}
