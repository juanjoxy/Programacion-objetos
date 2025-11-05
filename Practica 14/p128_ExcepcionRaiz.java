import java.util.Scanner;

public class p128_ExcepcionRaiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce un número: ");
            double numero = Double.parseDouble(sc.nextLine());
            
            if (numero < 0) {
                throw new Exception("Número negativo");
            }

            double resultado = Math.sqrt(numero);
            System.out.printf("El resultado es: %.2f%n", resultado);
        } catch (Exception e) {
            System.out.println("Error no puedo calcular la raíz cuadrada");
        }
    }
}
