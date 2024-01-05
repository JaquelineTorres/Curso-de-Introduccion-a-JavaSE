public class Functions {
    public static void main(String[] args) {
        double y = 3;

        //Area de un circulo PI * r2
        /*System.out.println(Math.PI*Math.pow(y,2));*/

        double area = circleArea(y);
        System.out.println("circle Area: " + area);

        //Area de una esfera 4*Pi*r2
        //System.out.println(4*Math.PI*Math.pow(y,2));
        System.out.println("sphere Area: " + sphereArea(y));

        /*
        //Volumen de una esfera 4/3*PI*r3
        System.out.println((4/3)*Math.PI*Math.pow(y,3));*/
        System.out.println("sphere Volumen: " + sphereVolume(y));

        System.out.println("Pesos a dólares: " + convertToDolar(1000, "COP"));
    }

    /**
     * @param r Radio del circulo
     * @author Jaqueline
     * Description: Función que cálcula el círculo de una área.
     */
    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    /**
     * @param r Radio de la esfera
     * @author Jaqueline
     * Description: Función que cálcula el área de una esféra.
     */
    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    /**
     * @param r Radio de la esféra
     * @author Jaqueline
     * Description: Función que calcula el volumen de una esféra.
     * */
    public static double sphereVolume(double r) {
        return ((double) 4 /3) * Math.PI * Math.pow(r, 3);
    }

    /**
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo esta validado para MXN o COP
     * @return quantity Devuelve la cantidad actualizada en dólares
     * @author Jaqueline
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dólares
     */
    public static double convertToDolar(double quantity, String currency) {
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.059;
                break;
            case "COP":
                quantity = quantity * 0.00026;
                break;
        }
        return quantity;
    }
}
