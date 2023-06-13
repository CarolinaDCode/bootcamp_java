package clase_07;

import java.util.Scanner;

public class AvgNumber2 {
    public static void main(String[] args){
        int[] numbers =  new int[5];
        Scanner intLoad = new Scanner(System.in);

        for (int count = 0; count < 5; count++){
            System.out.println("Por favor, ingrese un número:");
            Integer number = intLoad.nextInt();
            numbers[count] = number;
        }

        int count = 0;
        System.out.println("Los números que usted ingreso son:");
        while (count < 5){
            System.out.print(numbers[count]);
            count++;
        }

        System.out.println("\n");
        int major = 0;
        int minor = 0;

        for (int i = 0; i < numbers.length; i++){
            int num = numbers[i];
            if (num >= major || i == 0){
                major = num;
            }
            if (num <= minor || i == 0){
                minor = num;
            }
        }
        System.out.println("El número mayor es: " + major);
        System.out.println("El número menor es: " + minor);

        int suma = 0;
        for (int i = 0;i < numbers.length; i++){
            int num = numbers[i];
            suma += num;
        }

        System.out.println("El suma es: " + suma);

        float average = (float) suma / numbers.length;
        System.out.println("El promedio es: " + average);
    }
}
