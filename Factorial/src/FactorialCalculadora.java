import java.util.Scanner;

public class FactorialCalculadora {
    private int numero;

    // Constructor para inicializar el número
    public FactorialCalculadora(int numero) {
        this.numero = numero;
    }

    // Método para calcular el factorial
    public long calcularFactorial() {
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo: ");
        int numeroIngresado = scanner.nextInt();

        // Crear una instancia del objeto
        FactorialCalculadora calculadora = new FactorialCalculadora(numeroIngresado);

        // Calcular el factorial
        long factorial = calculadora.calcularFactorial();
        System.out.println("El factorial de " + numeroIngresado + " es: " + factorial);
    }
}
