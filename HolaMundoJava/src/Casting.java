public class Casting {
    public static void main(String[] args) {

        //Puntos de recompensa acumulados por el usuario (en formato double)
        double puntosRecompensa = 150.75;

        //Conversion a formato entero para determinar la cantidad de puntos disponibles para descuento
        int puntosParaDescuento = (int) puntosRecompensa;

        // Cálculo del descuento basado en la cantidad de puntos disponibles
        double descuento = calcularDescuento(puntosParaDescuento);

        //Impresion de resultados
        System.out.println("Puntos de recompensa acumulados: "+puntosRecompensa);
        System.out.println("Descuento aplicado: $"+descuento);

        char n = '1';
        int nI= n;
        System.out.println("char to int: " + nI);

        short nS = (short) n;
        System.out.println("n to short: " +nS);
    }

    // Método para calcular el descuento basado en la cantidad de puntos
    private static double calcularDescuento(int puntos) {
        // Supongamos que cada punto equivale a $0.50 de descuento
        final double VALOR_PUNTO_DESCUENTO = 0.50;
        return puntos * VALOR_PUNTO_DESCUENTO;
    }
}
