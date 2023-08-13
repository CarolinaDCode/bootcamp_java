package clase_25.ejercicio_03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){
        List<String> listaDeNombres = new ArrayList<>();
        listaDeNombres.add("Lucas");
        listaDeNombres.add("Sabrina");
        listaDeNombres.add("Pepe");

        listaDeNombres.stream()
                      .map(nombre -> nombre.toUpperCase())
                      .collect(Collectors.toList());
        /** listaDeNombres.stream().map(nombre -> nombre.toUpperCase()).toList(); */

        /**
        List<String> nombresEnMayuscula = new ArrayList<>();
        listaDeNombres.forEach(nombre ->
                nombresEnMayuscula.add(nombre.toUpperCase()));
        nombresEnMayuscula.forEach(nombre -> System.out.println(nombre));
         */
    }
}
