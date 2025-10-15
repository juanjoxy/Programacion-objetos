package p111_CuentaBancariaV2;

public class App {
    public static void main(String[] args) {
        Banco mibanco = new Banco("Banco del Norte SA de CV", "Priva las Cumbres 123");

        // Agregar clientes
        mibanco.agregarCliente(new Cliente("Carlos Fuentes"));
        mibanco.agregarCliente(new Cliente("Juan De La Fuente"));
        mibanco.agregarCliente(new Cliente("Rene Mayorga"));
        mibanco.agregarCliente(new Cliente("Maria Vazquez"));

        System.out.println("
>>> Clientes del banco:
");
        mibanco.reporte();

        // Agregar cuentas a los clientes
        mibanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000, 0.10));
        mibanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000, 0.20));
        mibanco.getClientes().get(0).agregarCuenta(new CuentaDeCheques(1000, 500));
        mibanco.getClientes().get(1).agregarCuenta(new CuentaDeCheques(2500, 500));
        mibanco.getClientes().get(2).agregarCuenta(new CuentaDeCheques(2000, 600));
        mibanco.getClientes().get(2).agregarCuenta(new CuentaDeAhorro(2000, 0.40));

        System.out.println("
>>> Clientes con sus cuentas y saldos iniciales:
");
        mibanco.reporte();

        // Movimientos: retiros y depósitos
        mibanco.getClientes().get(0).getCuentas().get(0).retira(500);
        mibanco.getClientes().get(0).getCuentas().get(1).retira(100);
        mibanco.getClientes().get(1).getCuentas().get(0).deposita(100);
        mibanco.getClientes().get(2).getCuentas().get(0).deposita(300);
        mibanco.getClientes().get(2).getCuentas().get(1).retira(1000);

        System.out.println("
>>> Después de los movimientos:
");
        mibanco.reporte();

        // Calcular intereses
        mibanco.calcularInteres();
        System.out.println("
>>> Después de calcular intereses:
");
        mibanco.reporte();
    }
}
