public class NumerosAscendentes {
    private int inicio;
    private int fin;

    // Constructor para inicializar los valores de inicio y fin
    public NumerosAscendentes(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    // Método para imprimir los números en orden ascendente
    public void imprimirNumerosAscendentes() {
        int numeroActual = inicio;
        while (numeroActual <= fin) {
            System.out.print(numeroActual + " ");
            numeroActual++;
        }
    }

    public static void main(String[] args) {
        int inicio = 1;
        int fin = 20;

        // Crear una instancia del objeto
        NumerosAscendentes ascendentes = new NumerosAscendentes(inicio, fin);

        // Imprimir los números en orden ascendente
        System.out.println("Números del " + inicio + " al " + fin + ":");
        ascendentes.imprimirNumerosAscendentes();
    }
}
