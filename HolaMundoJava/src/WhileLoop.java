public class WhileLoop {
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOnLight();

        int i = 1;
        while (isTurnOnLight && i <= 10) {
            printSOS();
            i++;
        }
    }

    public static void printSOS() {
        System.out.println("··· — — — ···");
    }

    public static boolean turnOnLight() {
        isTurnOnLight = (isTurnOnLight) ? false : true;
        return isTurnOnLight;
    }
}
