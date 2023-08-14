package clase_26.temperatura;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        List<Float> temperaturas = new ArrayList<>();
        temperaturas.add(68f);
        temperaturas.add(86f);
        temperaturas.add(78f);
        temperaturas.add(74f);
        temperaturas.add(75f);
        temperaturas.add(89f);

        /**
         List<Float> resultado = new ArrayList<>();
         for (Float tempFarenheit:temperaturas) {
            Float tempCelsius = (tempFarenheit - 32) * 0.5556f;
            resultado.add(tempCelsius);
            System.out.println(tempCelsius);
        }*/

        /**
        temperaturas.forEach(tempFahrenheit ->{
            Float tempCelsius = (tempFahrenheit - 32) * 0.5556f;
            resultado.add(tempCelsius);
            System.out.println(tempCelsius);
        });*/

        List<Float> resultado = temperaturas.stream().map(tempFahrenheit -> tempFahrenheit - 32) * 0.5556f).toList();

        resultado.forEach(temperatura -> {
            System.out.println("La temperatura es " + temperatura);
        });
    }
}
