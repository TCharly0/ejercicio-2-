public class NumerosPares {
    private int inicio;
    private int fin;

    // Constructor para inicializar los valores de inicio y fin
    public NumerosPares(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    // Método para imprimir los números pares en el rango
    public void imprimirNumerosPares() {
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int inicio = 2;
        int fin = 20;

        // Crear una instancia del objeto
        NumerosPares numerosPares = new NumerosPares(inicio, fin);

        // Imprimir los números pares del 2 al 20
        System.out.println("Números pares del " + inicio + " al " + fin + ":");
        numerosPares.imprimirNumerosPares();
    }
}

