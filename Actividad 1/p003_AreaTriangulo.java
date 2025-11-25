import java.util.Scanner;

public class p003_AreaTriangulo {
    public static void main(String[] args) {
        int base, altura;
        double area;
        Scanner obj = new Scanner(System.in);

        System.out.println("Dame la base ");
        base = obj.nextInt();
        System.out.println("Dame la altura ");
        altura = obj.nextInt();

        area = base * altura / 2;

        System.out.println(  String.format(" El triangulo de base %d y altura %d tiene un area de %.2f ",base, altura, area) );
    }
    
}
