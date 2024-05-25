import java.util.Scanner;

public class SumaNumerosPositivos {
    private double suma;

    // Constructor para inicializar la suma
    public SumaNumerosPositivos() {
        this.suma = 0;
    }

    // Método para solicitar números positivos y sumarlos
    public void sumarNumerosPositivos() {
        Scanner scanner = new Scanner(System.in);
        double numero;

        System.out.println("Ingresa números positivos (ingresa un número negativo para detenerse):");

        while (true) {
            System.out.print("Ingresa un número: ");
            numero = scanner.nextDouble();

            if (numero < 0) {
                break; // Salir del bucle si se ingresa un número negativo
            }

            suma += numero;
        }

        System.out.println("La suma de los números positivos ingresados es: " + suma);
    }

    public static void main(String[] args) {
        // Crear una instancia del objeto
        SumaNumerosPositivos sumador = new SumaNumerosPositivos();

        // Solicitar números positivos y calcular la suma
        sumador.sumarNumerosPositivos();
    }
}
