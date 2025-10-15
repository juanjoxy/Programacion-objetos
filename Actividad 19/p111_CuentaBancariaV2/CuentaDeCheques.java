package p111_CuentaBancariaV2;

public class CuentaDeCheques extends CuentaBancaria {
    private double sobregiro;

    public CuentaDeCheques(double cantidad, double sobregiro) {
        super(cantidad);
        this.sobregiro = sobregiro;
    }

    @Override
    public boolean retira(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        } else {
            double requerida = cantidad - saldo;
            if (sobregiro >= requerida) {
                saldo = 0;
                sobregiro -= requerida;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("CuentaDeCheques [ %s, Sobregiro = %.2f ]", super.toString(), sobregiro);
    }
}
