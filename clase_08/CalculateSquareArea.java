package clase_08;

import java.util.Scanner;

public class CalculateSquareArea {
    public static void main(String[] args){
        Scanner dataLoad = new Scanner(System.in);
        System.out.println("Por favor ingrese el lado de un cuadrado:");
        Integer side = dataLoad.nextInt();
        getSquareArea(side);
        /*
        float suma = 0;
        suma += getSquareArea(10);
        System.out.println("Suma de todas las areas: " + suma);
        */
    }

    /**
     * getSquareArea:
     * function that calculates and returns the area of a square
     */
    private static void getSquareArea(int lado) {
        int area = lado * lado;
        System.out.println("El lado del cuadrado es: " + area);
    }
}
