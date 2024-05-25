import java.util.Scanner;

public class MayorDeTresNumeros {
    private double numero1;
    private double numero2;
    private double numero3;

    // Constructor para inicializar los números
    public MayorDeTresNumeros(double num1, double num2, double num3) {
        this.numero1 = num1;
        this.numero2 = num2;
        this.numero3 = num3;
    }

    // Método para encontrar el mayor de los tres números
    public double encontrarMayor() {
        double mayor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }

        return mayor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Ingresa el tercer número: ");
        double num3 = scanner.nextDouble();

        // Crear una instancia del objeto
        MayorDeTresNumeros mayorFinder = new MayorDeTresNumeros(num1, num2, num3);

        // Encontrar el mayor número
        double mayor = mayorFinder.encontrarMayor();
        System.out.println("El mayor de los tres números es: " + mayor);
    }
}
