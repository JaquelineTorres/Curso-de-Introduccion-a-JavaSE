public class BreakContinueReturn {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                System.out.println("Entra a la primera condición i==3");
                continue;
            }
            if (i == 6) {
                System.out.println("Entra a la sgunda condición i==6");
                continue;
            }
            System.out.println(i);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("La suma es: " + suma(3, 4));
    }

    public static int suma(int a, int b) {
        return a + b;
    }
}
