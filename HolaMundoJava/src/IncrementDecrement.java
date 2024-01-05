public class IncrementDecrement {
    public static void main (String [] args){
        //Prefijo
        int contadorPrefijo = 5;
        int resultadoPrefijo = ++contadorPrefijo*2;//Incrementa 'contador' antes de ser 'utilizado'
        //Ahora, 'contadorPrefijo = 6, resultadoPrefijo = 12'

        System.out.println("******* PREFIJO *******");
        System.out.println("contadorPrefijo: "+contadorPrefijo);
        System.out.println("resultadoPrefijo: "+resultadoPrefijo);

        //Posfijo
        int contadorPosfijo = 5;
        int resultadoPosfijo = contadorPosfijo++*2;//Utiliza el valor original de 'contadorPosfijo' antes de incrementarse
        // Ahora, contador = 6, resultado = 10
        System.out.println("******* POSFIJO *******");
        System.out.println("resultadoPosfijo: "+resultadoPosfijo);
        System.out.println("contadorPosfijo: "+ contadorPosfijo);



    }
}
