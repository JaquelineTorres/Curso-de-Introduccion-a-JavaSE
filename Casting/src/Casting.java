public class Casting {
    public static void main(String [] args){
        /*Ejercicio 2

        Usando los dos tipos de casting que aprendiste (implícito y explícito), resuelve los siguientes casteos indicando qué tipo es y si se está calculando estimación o exactitud.

        char c = ‘z’; conviertelo a int = es conversion automatica (implícito) y está calculando exactitud.
        int i = 250; conviertelo a long y luego de long a short => int a long es conversion automatica (implícito) y está calculando exactitud. De long a short es conversion no automatica (explícita), está calculando estimación.
        double d = 301.067; conviertelo a long = es conversion no automatica (explícita), está calculando estimación.
        int i = 100; súmale 5000.66 y conviertelo a float = es conversion automatica (implícito) y está calculando exactitud.
        int i = 737; multiplícalo por 100 y conviertelo a byte = es conversion no automatica (explícita) y sufre un desbordamiento de rango porque está fuera del rango permitido para un byte, está calculando estimación.
        double d = 298.638; divídelo entre 25 y conviertelo a long =es conversion no automatica (explícita), está calculando estimación.
        */

        //char c = ‘z’; conviertelo a int
        char c = 'z';
        int cI = c;
        System.out.println("char to int: "+cI);

        //int i = 250; conviertelo a long y luego de long a short
        int i = 250;
        long iL = i;
        System.out.println("int to long to short: " + (short) iL);

        //double d = 301.067; conviertelo a long
        double d =  301.067;
        System.out.println("double to long: "+(long) d);

        //int i = 100; súmale 5000.66 y conviertelo a float
        int iInt = 100;
        float iIntF = iInt+5000.66F;
        System.out.println("Result: " + iIntF);

        //int i = 737; multiplícalo por 100 y conviertelo a byte
        int factorsFirst = 737;
        int factorsSecond = 100;
        int product = factorsFirst*factorsSecond;
        System.out.println("productByte: " + (byte)product);

        //double d = 298.638; divídelo entre 25 y conviertelo a long
        double dividend = 298.638;
        double divisor = 25;

        double quotient = dividend/divisor;
        System.out.println("double to long: "+ (long)quotient);
    }
}
