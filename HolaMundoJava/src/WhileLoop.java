public class WhileLoop {
    /**
     * Description: variable global que indica el estado de la lámpara del celular
     */
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOnLight();

        int i = 1;
        while (isTurnOnLight && i <= 10) {
            printSOS();
            i++;
        }
    }

    /**
     * Description: función que imprime el mensaje SOS en clave morse
     */
    public static void printSOS() {
        System.out.println("··· — — — ···");
    }

    /**
     * Description: indica si la lámpara del celular se encuentra encendida o no
     *
     * @return isTurnOnLight
     * @author Jaqueline
     */
    public static boolean turnOnLight() {
        isTurnOnLight = (isTurnOnLight) ? false : true;
        return isTurnOnLight;
    }
}
