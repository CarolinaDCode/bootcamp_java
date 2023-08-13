package clase_25.ejercicios;

import java.util.HashMap;
import java.util.Map;

public class CountWords {

    public static void main(String[] args){
        /*1 Contador de Palabras:
         Escribe un programa que reciba una cadena de texto como entrada y cuente cuántas veces aparece cada palabra
         en el texto. Utiliza un HashMap para almacenar las palabras como claves y sus frecuencias como valores
         */

        String texto = "Hola, que tal? Que estas haciendo";

        String[] palabras = texto.split(" ");

        Map<String, Integer> conteoDePalabras = new HashMap<>();
        for (String palabra: palabras){
            String palabraLimpia = StringUtil.limpiarPalabra(palabra);
            Integer contador = conteoDePalabras.get(palabraLimpia);
            if(contador == null){
                contador = 0;
            }
            contador++;
            conteoDePalabras.put(palabraLimpia, contador);
        }
        System.out.println(conteoDePalabras);

    }

}
