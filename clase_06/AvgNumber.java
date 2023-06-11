package clase_06;

import java.util.Scanner;
public class AvgNumber {
    public static void main(String[] args){
        Scanner dataLoad = new Scanner(System.in);
        System.out.println("Por favor ingrese 3 números, para calcular el promedio:");
        Integer num1 = dataLoad.nextInt();
        System.out.println("Primer número: " + num1);
        Integer num2 = dataLoad.nextInt();
        System.out.println("Segundo número: " + num2);
        Integer num3 = dataLoad.nextInt();
        System.out.println("Tercer número: " + num3);

        Integer rsAvg = (num1 + num2 + num3)/3;
        System.out.println("El promedio es: " + rsAvg);
    }
}
