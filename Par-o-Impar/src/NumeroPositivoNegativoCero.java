import java.util.Scanner;

public class NumeroPositivoNegativoCero {
    private double numero;

    // Constructor para inicializar el número
    public NumeroPositivoNegativoCero(double numero) {
        this.numero = numero;
    }

    // Método para verificar si el número es positivo, negativo o cero
    public void verificarNumero() {
        if (numero > 0) {
            System.out.println("El número ingresado es positivo.");
        } else if (numero < 0) {
            System.out.println("El número ingresado es negativo.");
        } else {
            System.out.println("El número ingresado es cero.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        double numeroIngresado = scanner.nextDouble();

        // Crear una instancia del objeto
        NumeroPositivoNegativoCero numeroVerificador = new NumeroPositivoNegativoCero(numeroIngresado);

        // Verificar el número
        numeroVerificador.verificarNumero();
    }
}

