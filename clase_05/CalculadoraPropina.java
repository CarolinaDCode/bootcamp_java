package clase_05;

import java.util.Scanner;

public class CalculadoraPropina {
    public static void main(String[] args){
        Scanner dataFirst = new Scanner(System.in);

        System.out.println("Por favor, Ingrese el Total de la Cuenta:");
        double dataTotalCta = dataFirst.nextDouble();

        if (dataTotalCta > 0){
            Scanner dataSecond = new Scanner(System.in);
            System.out.println("Por favor, Ingrese el % propina:");
            double dataPropina = dataSecond.nextDouble();

            double PropinaReal = dataTotalCta * (dataPropina  / 100);
            System.out.println("El monto de la propina es: " + PropinaReal);
        } else {
            System.out.println("Por favor ingrese un número válido");
        }
    }
}
