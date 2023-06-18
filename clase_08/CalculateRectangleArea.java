package clase_08;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args){
        Scanner dataLoad = new Scanner(System.in);
        System.out.println("Por favor ingrese la base del rectangulo:");
        Integer baseNum = dataLoad.nextInt();
        baseNum = validationIsZero("base", baseNum, dataLoad);

        System.out.println("Por favor ingrese la altura del rectangulo:");
        Integer heightNum = dataLoad.nextInt();
        heightNum = validationIsZero("altura", heightNum, dataLoad);

        getRectangleArea(baseNum, heightNum);
    }
    /**
     * getRectangleArea:
     * function that calculates and returns the area of a rectangle
     */
    private static void getRectangleArea(int base, int height) {
        int area = base * height;
        System.out.println("El area del rectangulo es: " + area);
    }

    private static int validationIsZero(String side, int sideNum, Scanner scanData){
        while(sideNum == 0) {
            System.out.println("Por favor ingrese un número valido para la " + side);
            sideNum = scanData.nextInt();
        }
        return sideNum;
    }
}
