import java.util.Scanner;
public class FuncionesTrigonometricas {
    public static void main(String[] args) {
    System.out.print("\033[H\033[2J"); System.out.flush();
    System.out.print("Escribe tu angulo en Grados: ");
    double angulog = new Scanner(System.in).nextDouble();
    double angulor = Math.toRadians(angulog);
    double sen = Math.sin(angulor);
    double cos = Math.cos(angulor);
    double tan = Math.tan(angulor);
    System.out.println(String.format("El angulo es: %.2f, el Seno: %.2f, el Coseno: %.2f, y la Tangente: %.2f",angulor,sen,cos,tan));
    }    
}
