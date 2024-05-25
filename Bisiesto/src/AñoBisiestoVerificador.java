import java.util.Scanner;

public class AñoBisiestoVerificador {
    private int anio;

    // Constructor para inicializar el año
    public AñoBisiestoVerificador(int anio) {
        this.anio = anio;
    }

    // Método para verificar si el año es bisiesto
    public boolean esBisiesto() {
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un año: ");
        int anioIngresado = scanner.nextInt();

        // Crear una instancia del objeto
        AñoBisiestoVerificador verificador = new AñoBisiestoVerificador(anioIngresado);

        // Verificar si es bisiesto
        if (verificador.esBisiesto()) {
            System.out.println("El año " + anioIngresado + " es bisiesto.");
        } else {
            System.out.println("El año " + anioIngresado + " no es bisiesto.");
        }
    }
}

