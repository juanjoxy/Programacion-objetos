package p111_CuentaBancariaV2;

public abstract class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double cantidad) {
        this.saldo = cantidad;
    }

    public void deposita(double cantidad) {
        if (cantidad > 0)
            saldo += cantidad;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract boolean retira(double cantidad);

    @Override
    public String toString() {
        return String.format("Saldo = %.2f", saldo);
    }
}
