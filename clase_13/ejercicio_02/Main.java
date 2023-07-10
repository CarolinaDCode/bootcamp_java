package clase_13.ejercicio_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        /*
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
        }*/
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

    private static void creacionPersonaje(){
        List<PersonajeBase> personajes = new ArrayList<>();

        PersonajeBase p1 = new PersonajeBase();
        p1.recibeDanio("Darien",10);
        personajes.add(p1);

        //Defensa
        Items casco = new Items();
        casco.setDefensa(30);

        Items chaleco = new Items();
        chaleco.setDefensa(50);

        Items escudo = new Items();
        escudo.setDefensa(20);

        Items botas = new Items();
        botas.setDefensa(20);

        //Defensa
        Items machete = new Items();
        machete.setAtaque(30);

        Items barraElectrica = new Items();
        barraElectrica.setAtaque(35);

        p1.getItems().add(casco);
        p1.getItems().add(chaleco);
        p1.getItems().add(escudo);
        p1.getItems().add(botas);
        p1.getItems().add(machete);
        p1.getItems().add(barraElectrica);

        PersonajeBase p2 = new PersonajeBase();
        Items escudoDeMadera = new Items();
        p2.getItems().add(escudoDeMadera);
        Items espadaBlanca = new Items();
        p2.getItems().add(espadaBlanca);
        personajes.add(p2);
    }

    private static void escojerNivel(){
        return;
    }
}
