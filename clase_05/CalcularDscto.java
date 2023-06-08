package clase_05;

import java.util.Scanner;

public class CalcularDscto {

    public static void main(String[] args){
        Scanner dataFirst = new Scanner(System.in);

        System.out.println("Por favor, ingrese el precio del Producto");
        double dataPrice = dataFirst.nextDouble();

        if (dataPrice > 0) {
            Scanner dataSecond = new Scanner(System.in);
            System.out.println("Por favor, ingrese el descuento %");
            double dataPorcent = dataSecond.nextDouble();

            double PriceDscto = dataPrice - (dataPrice * dataPorcent / 100);
            System.out.println("El precio con dscto es: " + PriceDscto);

        } else {
            System.out.println("Por favor ingrese un número válido");
        }

    }
}
