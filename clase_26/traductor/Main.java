package clase_26.traductor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Crea una aplicación de Traducción simple que tome palabras de un idioma y las traduzca a otro.
         * Utiliza un HashMap para almacenar pares de palabras clave valor que representen las traducciones
         */
        Map<String, String> diccionarioITaPT = new HashMap<>();
        diccionarioITaPT.put("spaghetti", "espaguete");
        diccionarioITaPT.put("auto", "carro");
        diccionarioITaPT.put("programmazione", "programação");
        diccionarioITaPT.put("mela", "maçã");
        diccionarioITaPT.put("gamba", "perna");
        diccionarioITaPT.put("birra", "cerveja");
        diccionarioITaPT.put("lavoro", "Trabalhar");
        diccionarioITaPT.put("errore", "erro");
        diccionarioITaPT.put("incontro", "encontro");
        diccionarioITaPT.put("compilare", "compilar");
        diccionarioITaPT.put("burro", "espaguete");
        diccionarioITaPT.put("farfalla", "borboleta");

        System.out.println("Escribe una palabra en italiano y yo la traduciré al portugues:");
        Scanner teclado = new Scanner(System.in);
        String palabraDelUsuario = teclado.nextLine();
        String palabraTraducida = diccionarioITaPT.get(palabraDelUsuario);
        String traduccion = String.format("La palabra %s en portugues se dice %s", palabraDelUsuario, palabraTraducida);
        System.out.println(traduccion);
    }
}
