package clase_06;

import java.util.Scanner;

public class MayorMinor {
    public static void main(String[] args){
        Scanner dataLoad = new Scanner(System.in);
        System.out.println("Por favor ingrese 3 números");
        Integer num1 = dataLoad.nextInt();
        System.out.println("Primer número: " + num1);
        Integer num2 = dataLoad.nextInt();
        System.out.println("Segundo número: " + num2);
        Integer num3 = dataLoad.nextInt();
        System.out.println("Tercer número: " + num3);

        Integer numMayor = num1;
        if (num2 > numMayor) {
            numMayor = num2;
        }
        if(num3 > numMayor){
            numMayor = num3;
        }

        Integer numMenor = num1;
        if (num2 < numMenor) {
            numMenor = num2;
        }
        if(num3 < numMenor) {
            numMenor = num3;
        }

        System.out.println("El número mayor es: " + numMayor);
        System.out.println("El número menor es: " + numMenor);
    }
}
