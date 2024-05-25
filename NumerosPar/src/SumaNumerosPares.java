import java.util.Scanner;

public class SumaNumerosPares {
    private int n;

    // Constructor para inicializar el número n
    public SumaNumerosPares(int n) {
        this.n = n;
    }

    // Método para calcular la suma de los números pares
    public int calcularSumaPares() {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo (n): ");
        int numeroIngresado = scanner.nextInt();

        // Crear una instancia del objeto
        SumaNumerosPares sumador = new SumaNumerosPares(numeroIngresado);

        // Calcular la suma de los números pares
        int sumaPares = sumador.calcularSumaPares();
        System.out.println("La suma de los números pares desde 1 hasta " + numeroIngresado + " es: " + sumaPares);
    }
}
