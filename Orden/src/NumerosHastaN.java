import java.util.Scanner;

public class NumerosHastaN {
    private int numero;

    // Constructor para inicializar el número
    public NumerosHastaN(int numero) {
        this.numero = numero;
    }

    // Método para imprimir los números desde 1 hasta el número ingresado
    public void imprimirNumeros() {
        int contador = 1;
        while (contador <= numero) {
            System.out.print(contador + " ");
            contador++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numeroIngresado = scanner.nextInt();

        // Crear una instancia del objeto
        NumerosHastaN numeros = new NumerosHastaN(numeroIngresado);

        // Imprimir los números desde 1 hasta el número ingresado
        System.out.println("Números desde 1 hasta " + numeroIngresado + ":");
        numeros.imprimirNumeros();
    }
}
