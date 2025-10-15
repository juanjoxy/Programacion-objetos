package p111_CuentaBancariaV2;

public class CuentaDeAhorro extends CuentaBancaria {
    private double tasaInteres;

    public CuentaDeAhorro(double cantidad, double tasaInteres) {
        super(cantidad);
        this.tasaInteres = tasaInteres;
    }

    public void calcularInteres() {
        saldo += saldo * tasaInteres;
    }

    @Override
    public boolean retira(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("CuentaDeAhorro [ %s, TasaInteres = %.2f ]", super.toString(), tasaInteres);
    }
}
