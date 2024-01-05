public class OperatorsOnBooleanTypes {
    public static void main(String []args){
/*        boolean b = false;
        System.out.println(!b);*/
        boolean a = false;
        boolean b = false;
        System.out.println("a||b= " + (a||b));
        System.out.println("\n**************************************************\n");
        boolean esEstudiante = true;
        int edad = 10;
        boolean condicionCompleja = (edad >= 18 && esEstudiante);//is false
        //System.out.println("condicionCompleja: " +condicionCompleja);

        if(!condicionCompleja){// is !false = true
            System.out.println("It does not meet either of the two conditions (age and/or student status).");
        }else{
            System.out.println("He/she is over 18 years old and is a student.");
        }

        System.out.println("\n**************************************************\n");
        /* Question 4
        Given the following program defining two variables
        class Main {
            public static void main(String[] args) {
                int a = 16;
                int b = 8;

            }
        }

        Exercise
        implement a check (using boolean operators and number operators) that tells you if both a and b are greater than 10 (hint: implement and then rerun program with different values assigned to a and b to check that it is correct)
        implement a check (using boolean operators and number operators) that tells you if either a or b are smaller than 10 (hint: implement and then rerun program with different values assigned to a and b to check that it is correct)
        implement a check (using boolean operators and number operators) that tells you if a is at least two times bigger than b (hint: implement and then rerun program with different values assigned to a and b to check that it is correct), i.e. for a = 16 and b = 8 your check should return true (as a is two times b)
        */

        int aI = 16;
        int bI = 8;

        //if both a and b are greater than 10
        boolean isGreaterThanTen = (aI >10 && bI >10);

        //if either a or b are smaller than 10
        boolean isSmallerThanTen =(aI<10 || bI<10);

        // if a is at least two times bigger than b
        boolean isTwoTimesBiggerThanB = (aI*2 >=bI );

        /*NOTA:
         *
         He optado por usar declaraciones if. La razón detrás de esta elección radica en el comportamiento de la estructura "else if".
         * Cuando se usa "else if", solo se evalúa y ejecuta la primera condición que sea verdadera. Si tienes múltiples condiciones que podrían ser verdaderas
         * de manera independiente, es posible que quieras que se evalúen y ejecuten todas las condiciones verdaderas.
         *
         * */
        if(isGreaterThanTen){
            System.out.println("Both a and b are greater than 10");
        }if(isSmallerThanTen){
            System.out.println("a or b are smaller than 10");
        }if(isTwoTimesBiggerThanB && bI<10){
            System.out.println("a is at least two times bigger than b");
        }
    }
}