public class Arrays {
    public static void main (String [] args){
        String [] androidVersiones = new String[17];//No es un buen uso, ya que el tamaño pude variar
        String days [] = new String[7];//Los días de la semana no cambian, buen uso de arreglo
        //Arreglo de 2 dimensiones
        String[][] cities = new String[4][2];

        int [][][] numbers = new int [2][2][2];
        int [][][][] numbers4 = new int [2][2][2][2];

        androidVersiones [0] = "Apple Pie";
        androidVersiones [1] = "Bannana Bread";
        androidVersiones [2] = "Cupcake";
        androidVersiones [3] = "Donut";

        //System.out.println(androidVersiones[0]);
        //System.out.println(androidVersiones[1]);
        //System.out.println(androidVersiones[2]);
        //System.out.println(androidVersiones[3]);

        System.out.println("Whit tradicional for");
        for (int i = 0; i < androidVersiones.length-1; i++){
            //System.out.println(i);
            System.out.println(androidVersiones[i]);
        }

        System.out.println("------------------------------------");
        System.out.println("Whit foreach");
        for (String androidVersion :
             androidVersiones) {
            System.out.println(androidVersion);
        }


        System.out.println();
        System.out.println();

        //cities[ renglón ][ columna ]
        cities[0][0] = "Colombia";
        cities[0][1] = "Medellín";

        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";

        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";

        cities[3][0] = "México";
        cities[3][1] = "CDMX";

        //System.out.println("cities.length = "+cities[1].length);

        for (int i = 0; i< cities.length;i++){
            for(int j = 0; j< cities[i].length; j++){
                System.out.println(cities[i][j]);
            }

            System.out.println("------------------------------------");
        }

        System.out.println("Whit foreach");
        for (String [] pairCity : cities){
            for (String name: pairCity) {
                System.out.println(name);
            }
            System.out.println("------------------------------------");
        }

        /*System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println("------------------------------------");
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println("------------------------------------");
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println("------------------------------------");
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);*/



        String [][][][] animals = new String[2][3][2][2];
        animals [1][0][0][1]="Monkey";
      //  System.out.println(animals[1][0][0][1]);

        for (int i = 0; i <= 1 ; i++) {
            for (int j = 0; j <=0 ; j++) {
                for (int k = 0; k <= 0 ; k++) {
                    for (int l = 0; l <= 1 ; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }

                }

            }

        }

        System.out.println("++++++++++++++++++++++++++++++++");
        int x = 1; while (x <= 10) System.out.println(++x);


    }
}
