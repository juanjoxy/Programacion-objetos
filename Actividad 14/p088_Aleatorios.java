import java.util.Random;

public class p088_Aleatorios {
    public static void main(String[] args) {
        Random rnd = new Random();

        int aleatorio1 = Math.abs(rnd.nextInt()); 
        int aleatorio2 = rnd.nextInt(31);
        int aleatorio3 = rnd.nextInt(50) + 50;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.printf("\nNúmero aleatorio entero positivo: %d", aleatorio1);
        System.out.printf("\nNúmero aleatorio 0 .. 30         : %d", aleatorio2);
        System.out.printf("\nNúmero aleatorio en 50 a 99      : %d", aleatorio3);
    }
}
