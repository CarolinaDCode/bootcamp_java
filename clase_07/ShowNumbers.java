package clase_07;

import java.util.Scanner;

public class ShowNumbers {
    public static void main(String[] args){

        int[] numbers =  new int[5];

        Scanner intLoad = new Scanner(System.in);

        int count = 0;
        while (count < 5) {
            System.out.println("Por favor, ingrese un número:");
            Integer number = intLoad.nextInt();
            numbers[count] = number;
            count++;
        }

        count = 0;
        System.out.println("Los números que usted ingreso son:");
        while (count < 5){
            System.out.print(numbers[count]);
            count++;
        }
    }
}
