package clase_24.streams;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        //STREAMS Y EXPRESIONES LAMBDA EN JAVA
        List<String> frutas = new ArrayList<>();
        //Antes de la Versión 8 de Java
        /**
        frutas.add("pera");
        frutas.add("mandarina");
        frutas.add("piña");
        frutas.add("platano");

        for (String fruta:frutas){
            System.out.println(fruta);
        }
         */

        //Después de la Versión 8 de Java, con exp. Lambda
        //Parallel: utiliza todo el poder del microprocesador
        // ejecutando varios procesos al mismo tiempo. haciendo el recorrido más rapido
        frutas.stream().parallel().forEach(fruta->System.out.println(fruta));

        /**
         * NOTA:
         * Existen 2 tipo de funciones
         * Las Funciones Terminal y las No terminales
         * .forEach(()->)
         * Esta es una función terminal, esto quiere decir que después del for Each
         * no se puede concatenar ninguna función más.
         * NO TERMINALES
         * .filter(), flatMap() entre otras, a estas si se les puede concatenar más funciones.
         */

    }
}
