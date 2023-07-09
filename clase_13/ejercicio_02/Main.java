package clase_13.ejercicio_02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Boolean stateMenu = true;

        while (stateMenu){
            System.out.println("******** MENU ***********");
            System.out.println("1) PLAY");
            System.out.println("2) LEVELS");
            System.out.println("3) QUIT");

            Scanner dataInput = new Scanner(System.in);
            int rptaUsuario = dataInput.nextInt();

            switch(rptaUsuario) {
                case 1:
                    escojerPersonaje();
                    break;
                case 2:
                    escojerNivel();
                    break;
                case 3:
                    stateMenu = false;
                    break;
            }
        }
    }

    private static void escojerPersonaje(){
        System.out.println("Puedes escojer entre uno de estos 3 personajes");
        System.out.println("1) Arquero");
        System.out.println("2) Guerrero");
        System.out.println("3) Mago");

        Scanner dataInput = new Scanner(System.in);
        int rptaUsuario = dataInput.nextInt();

        switch(rptaUsuario) {
            case 1:
                System.out.println("Escojiste ser un Arquero");
                break;
            case 2:
                System.out.println("Escojiste ser un Guerrero");
                break;
            case 3:
                System.out.println("Escojiste ser un Mago");
                break;
        }

        //Aplican metodo random para que la pc escoja a su personaje
    }

    private static void escojerNivel(){
        return;
    }
}
