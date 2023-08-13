package clase_25.ejemplo;

import java.util.Map;


public class HashMap {
    public static void main(String[] args){
        //HASHMAP
        /**
         * Es como una lista solo que los elementos quedan asociados a otro.
         * Suele ser más similar a un diccionario
         */
        Map<String, String> diccionario = new java.util.HashMap<>();
        diccionario.put("SMS", "Mensaje de Texto");
        diccionario.put("LOL", "Reirse");
        diccionario.put("AFK", "Que la persona no esta en la computadora");
        diccionario.put("OMG", "Oh my god");
        diccionario.put("ASAP", "Tan pronto como puedas");

        System.out.println(diccionario.get("AFK"));
        System.out.println(diccionario.values());
        System.out.println(diccionario.keySet());

    }
}
