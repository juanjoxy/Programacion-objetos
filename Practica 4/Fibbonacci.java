public class Fibbonacci {
    public static void main(String[] args) {
        System.out.println("Secuencia fibbonacci");
        int n1, n2, r;

        n1 = 0;
        n2 = 1;
        r = 0;
        while (r < 1000) {
            r = n1 + n2;
            System.out.println(r);
            n1 = n2;
            n2 = r;
        }
    }
}
