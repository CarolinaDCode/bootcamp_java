package clase_05;

import java.util.Scanner;

public class AdivinaNum {

    public static void main(String[] args){

        Integer nRandom = (int) (Math.random() * 10 +1);

        Integer numInput;

        System.out.println("ADIVINA EL NUMERO");
        System.out.println("Elige un número entre 0 y 10:");

        for(int i = 0; ; i++){
            Scanner input = new Scanner(System.in);
             numInput = input.nextInt();

            if(nRandom < numInput){
               System.out.println("El número Mágico es menor a " + numInput);
            }else if(nRandom > numInput){
                System.out.println("El número Mágico es mayor a " + numInput);
            }else if(nRandom == numInput){
                System.out.println("******************************");
                System.out.println("FELICIDADES!!!");
                System.out.println("Adivinaste el número mágico en " + i + " intentos");
            }
        }
    }
}
