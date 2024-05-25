import java.util.Scanner;

public class ParImparVerificador {
    private int numero;

    // Constructor para inicializar el número
    public ParImparVerificador(int numero) {
        this.numero = numero;
    }

    // Método para verificar si el número es par o impar
    public void verificarParImpar() {
        if (numero % 2 == 0) {
            System.out.println("El número ingresado es par.");
        } else {
            System.out.println("El número ingresado es impar.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numeroIngresado = scanner.nextInt();

        // Crear una instancia del objeto
        ParImparVerificador verificador = new ParImparVerificador(numeroIngresado);

        // Verificar si es par o impar
        verificador.verificarParImpar();
    }
}

