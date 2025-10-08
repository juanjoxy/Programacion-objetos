package p105_PuntoTriangulo;

public class Triangulo {
    private Punto v1;
    private Punto v2;
    private Punto v3;

    public Triangulo() {
        this.v1 = new Punto();
        this.v2 = new Punto();
        this.v3 = new Punto();
    }

    public Triangulo(Punto v1, Punto v2, Punto v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public Punto getV1() {
        return v1;
    }

    public void setV1(Punto v1) {
        this.v1 = v1;
    }

    public Punto getV2() {
        return v2;
    }

    public void setV2(Punto v2) {
        this.v2 = v2;
    }

    public Punto getV3() {
        return v3;
    }

    public void setV3(Punto v3) {
        this.v3 = v3;
    }

    public double getPerimetro() {
        double lado1 = v1.getDistancia(v2);
        double lado2 = v2.getDistancia(v3);
        double lado3 = v3.getDistancia(v1);
        return lado1 + lado2 + lado3;
    }

    public String getTipo() {
        double lado1 = v1.getDistancia(v2);
        double lado2 = v2.getDistancia(v3);
        double lado3 = v3.getDistancia(v1);

        final double EPSILON = 1e-6;

        boolean eq1 = Math.abs(lado1 - lado2) < EPSILON;
        boolean eq2 = Math.abs(lado2 - lado3) < EPSILON;
        boolean eq3 = Math.abs(lado1 - lado3) < EPSILON;

        if (eq1 && eq2) {
            return "Equilatero";
        } else if (eq1 || eq2 || eq3) {
            return "Isoseles";
        } else {
            return "Escaleno";
        }
    }

    @Override
    public String toString() {
        return "Triangulo [V1=" + v1 + ", V2=" + v2 + ", V3=" + v3 + "]";
    }
}