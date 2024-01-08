public class ForLoop {
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            printSOS();
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


