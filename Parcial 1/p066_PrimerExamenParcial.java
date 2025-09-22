import java.util.Scanner;

public class  p066_PrimerExamenParcial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opc = 'S';

        final double P_EST = 50.0;
        final double P_ADL = 90.0;
        final double P_SEN = 60.0;

        int totalEstudiantes = 0;
        int totalAdultos = 0;
        int totalTerceraEdad = 0;

        int totalHombres = 0;
        int totalMujeres = 0;
        int totalRechazados = 0;
        int totalAsistentes = 0;
        int sumaEdades = 0;

        double ingresosEstudiantes = 0;
        double ingresosAdultos = 0;
        double ingresosTerceraEdad = 0;

        do {
            System.out.println("--- Nueva Venta ---");

            System.out.print("Ingrese la edad del comprador: ");
            int edad = sc.nextInt();
            sc.nextLine();

            if (edad < 13) {
                System.out.println("Acceso denegado. La película es clasificación B (mayores de 13 años).");
                totalRechazados++;
            } else {
                System.out.print("Ingrese el tipo de comprador (Estudiante / Adulto / Tercera Edad): ");
                String tipo = sc.nextLine().trim().toLowerCase();

                System.out.print("Ingrese el sexo (Hombre / Mujer): ");
                String sexo = sc.nextLine().trim().toLowerCase();

                boolean tipoValido = true;
                double precioBoleto = 0;

                switch (tipo) {
                    case "estudiante":
                        totalEstudiantes++;
                        precioBoleto = P_EST;
                        ingresosEstudiantes += precioBoleto;
                        break;
                    case "adulto":
                        totalAdultos++;
                        precioBoleto = P_ADL;
                        ingresosAdultos += precioBoleto;
                        break;
                    case "tercera edad":
                        totalTerceraEdad++;
                        precioBoleto = P_SEN;
                        ingresosTerceraEdad += precioBoleto;
                        break;
                    default:
                        System.out.println("Tipo de comprador inválido.");
                        tipoValido = false;
                }

                if (!tipoValido) continue;

                if (sexo.equals("hombre")) {
                    totalHombres++;
                } else if (sexo.equals("mujer")) {
                    totalMujeres++;
                } else {
                    System.out.println("Sexo inválido.");
                    continue;
                }

                totalAsistentes++;
                sumaEdades += edad;

                System.out.println("Venta registrada con éxito.");
                System.out.println("Bienvenido/a - Edad: " + edad + ", Sexo: " + sexo + ", Tipo: " + tipo);
            }

            System.out.print("\n¿Desea registrar otra venta? [S/N]: ");
            opc = sc.next().toUpperCase().charAt(0);
            System.out.println("----------------------");

        } while (opc == 'S');

        double totalIngresos = ingresosEstudiantes + ingresosAdultos + ingresosTerceraEdad;
        double promedioEdad = (totalAsistentes > 0) ? ((double) sumaEdades / totalAsistentes) : 0;

        System.out.println("\n===== REPORTE FINAL DE LA FUNCIÓN =====");

        System.out.println("--- Estadísticas del Público ---");
        System.out.println("Total de Estudiantes: " + totalEstudiantes);
        System.out.println("Total de Adultos: " + totalAdultos);
        System.out.println("Total de Personas de la Tercera Edad: " + totalTerceraEdad);
        System.out.println("Total de Hombres: " + totalHombres);
        System.out.println("Total de Mujeres: " + totalMujeres);
        System.out.println("Total de Asistentes: " + totalAsistentes);
        System.out.printf("Promedio de Edad: %.2f\n", promedioEdad);
        System.out.println("Total de Personas Rechazadas: " + totalRechazados);

        System.out.println("\n--- Reporte de Ingresos ---");
        System.out.printf("Ingresos por Estudiantes: $%.2f\n", ingresosEstudiantes);
        System.out.printf("Ingresos por Adultos: $%.2f\n", ingresosAdultos);
        System.out.printf("Ingresos por Tercera Edad: $%.2f\n", ingresosTerceraEdad);
        System.out.printf("Total Recaudado: $%.2f\n", totalIngresos);

        System.out.println("\n--- Rentabilidad del Evento ---");
        if (totalIngresos < 1500) {
            System.out.println("La función generó BAJAS ganancias.");
        } else if (totalIngresos <= 3500) {
            System.out.println("La función generó ganancias MODERADAS.");
        } else {
            System.out.println("La función generó BUENAS ganancias.");
        }

        sc.close();
    }
}
/* Preguntas teoricas, contesta con tus propias palabras, aqui mismo:

1. ¿ Qué estructura utilizaste para determinar el tipo de comprador y por que no otra estructura?

Utilice switch por la facilidad de usarlo, ya que es mas facil escribir varias veces "case" que escribir if tras if tras if, ya que varios if hacen mas confuso el codigo

2. ¿ Qué tipo de dato elegiste para las variables que cuentan el tipo de público que asiste a la función y por qué fue la mejor opción?

Int debido a que el numero de personas siempre sera entero, por lo que no se necesita usar un float o mas ya que no se usaria por completo

3. ¿ Qué tipo de dato elegiste para las variables que almacenan el dinero recaudado y por qué esa fue la mejor opción?

Double debido a que trabajamos con variables que usan decimales, pero no usamos float debido a que este dato tiende a redondear, y por lo tanto tendria mas errores de calculo monetario

4. Si tuvieras que añadir un nuevo tipo de comprador, 'Socio del Cine', ¿Qué partes exactas de tu código necesitarías modificar?"

Deberiamos de agregar un nuevo dato de precio junto con las demas constantes que se encuentran de la linea 9 a la 11
Deberiamos tambien agregar variables tipo int y double para calcular la cantidad de socios (int) y los ingresos de estos (double) junto a las demas variables de este estilo
Se agregaria un nuevo caso en el switch, especificamente antes del break para poder dar la opcion final
Y finalmente se deberian agregar los datos al reporte de ingresos final, agregando el dinero ingresado por los socios al total de ingresos

 */