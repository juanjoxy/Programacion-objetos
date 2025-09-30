public class p87_ArregloTemperaturas {

    public static void Mostrar(double[] t) {
        for (double v : t)
            System.out.print(v + " ");
        System.out.println(); 
    }

    public static double Mayor(double[] t) {
        double m = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i] > m) m = t[i];
        }
        return m;
    }

    public static double Promedio(double[] t) {
        double s = 0;
        for (int i = 0; i < t.length; i++) {
            s += t[i];
        }
        return s / t.length;
    }

    public static int Buscar(double[] t, double b) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] == b)
                return i; 
        }
        return -1;
    }

    public static void main(String[] args) {
        double[] temps = {12.34, 56.22, 56.78, 0.0, 10.25, 60.22};
        double temp = 10.25;
        int pos;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("\nLas temperaturas son:");
        Mostrar(temps);

        System.out.printf("\nLa temperatura mayor es: %.2f", Mayor(temps));
        System.out.printf("\nEl promedio es: %.2f", Promedio(temps));

        pos = Buscar(temps, temp);
        if (pos != -1)
            System.out.printf("\nLa temperatura %.2f fue encontrada en la posición %d", temp, pos);
        else
            System.out.println("\nEl elemento no existe");

        System.out.println("\n\nProceso terminado");
    }
}
