package clase_05;

import java.util.Scanner;

public class ConversorMillasKm {

    public static void main(String[] args) {
        Scanner dataLoad = new Scanner(System.in);

        System.out.println("Ingrese una distancia en millas");
        double dataLoadMiles = dataLoad.nextDouble();

        if (dataLoadMiles > 0){
            double km = 1.60934;
            double kmConvert = dataLoadMiles * km;
            System.out.println("Los km de las millas ingresadas son : " + kmConvert);
        } else {
            System.out.println("Ingrese un número mayor");
        }
    }
}

