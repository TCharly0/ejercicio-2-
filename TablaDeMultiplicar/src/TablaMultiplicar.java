import java.util.Scanner;

public class TablaMultiplicar {
    private int numero;

    // Constructor para inicializar el número
    public TablaMultiplicar(int numero) {
        this.numero = numero;
    }

    // Método para mostrar la tabla de multiplicar
    public void mostrarTabla() {
        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numeroIngresado = scanner.nextInt();

        // Crear una instancia del objeto
        TablaMultiplicar tabla = new TablaMultiplicar(numeroIngresado);

        // Mostrar la tabla de multiplicar
        tabla.mostrarTabla();
    }
}