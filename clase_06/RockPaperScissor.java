package clase_06;

import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner dataLoad = new Scanner(System.in);
        System.out.println("Elige Piedra, Papel o Tijera: Piedra(1)-Papel(2)-Tijera(3)");
        Integer playerSymbol = dataLoad.nextInt();

        /**
         * Formula Números aleatorios del 1 al 3:
         * min = 1, max = 3;
         * Math.floor(Math.random()*(max-min+1)+min)
         */
        Integer pcSymbol = (int) Math.floor(Math.random() * 3 + 1);

        while (playerSymbol != 1 && playerSymbol != 2 && playerSymbol != 3) {
            System.out.println("Elige una opción válida");
            playerSymbol = dataLoad.nextInt();
        }

        switch(playerSymbol) {
            case 1:
                System.out.println("Elegiste Piedra y");
                break;
            case 2:
                System.out.println("Elegiste Papel y");
                break;
            case 3:
                System.out.println("Elegiste Tijera y");
                break;
        }

        switch(pcSymbol) {
            case 1:
                System.out.println("PC eligió Piedra");
                break;
            case 2:
                System.out.println("PC eligió Papel");
                break;
            case 3:
                System.out.println("PC eligió Tijera");
                break;
        }

        if (playerSymbol == pcSymbol) {
            System.out.println("EMPATE!!!");
            System.exit(0);
        }
        if (playerSymbol == 1 && pcSymbol == 3) {
            System.out.println("GANASTE!!!");
        }else if(playerSymbol == 2 && pcSymbol == 1) {
            System.out.println("GANASTE!!!");
        }else if(playerSymbol == 3 && pcSymbol == 2){
            System.out.println("GANASTE!!!");
        }else{
            System.out.println("PERDISTE!!!");
        }
    }
}
