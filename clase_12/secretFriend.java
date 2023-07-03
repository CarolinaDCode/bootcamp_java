package clase_12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class secretFriend {
    public static void main(String[] args){
        System.out.println("!Hola!, tu eres el lider, dime: ¿Cuántas personas van a jugar al Amigo Secreto?");
        Scanner dataEntry = new Scanner(System.in);
        int amountPeople = dataEntry.nextInt();

        String[] listFriends = new String[amountPeople];

        for(int i = 0; i < amountPeople; i++){
            System.out.println("Ingresa el nombre de una persona");
            String namePerson = dataEntry.next();
            listFriends[i] = namePerson;
        }
        //System.out.println(Arrays.toString(listFriends));

        String[] agasajados = new String[amountPeople];
        String[] listAsignPerson = new String[amountPeople];



        for (int i=0; i<amountPeople; i++){
              //agasajados[i] = listFriends[ranNum];
        }

        /**
         * Formula Números aleatorios del 1 al 3:
         * min = 1, max = 3;
         * Math.floor(Math.random()*(max-min+1)+min)
         */
        //Integer pcSymbol = (int) Math.floor(Math.random() * 3 + 1);


        /**
        for (int i=0; i<amountPeople; i++){
           int indice = i + 1;
           if (indice >= amountPeople){
               indice = 0;
               agasajados[i] = listFriends[indice];
           }
        }
        System.out.println(Arrays.toString(agasajados));
        */
        agasajados = listFriends;
        for (int i = 0; i < amountPeople; i++){
            String nombreDeLaPersona = listFriends[i];
            System.out.println("Que " + nombreDeLaPersona + " se acerque a la computadora y escriba PRESENTE");
            dataEntry.next();
            //String nombreDelAgasajado = agasajados[i];
            int ranNum = (int) Math.floor(Math.random() * amountPeople + 0);
            //for (int j = 0; j < agasajados.length; j++){
            for (int j = 0; j < 1; j++){
                if (!agasajados[j].equals(listFriends[i])){
                    //listAsignPerson[i] = agasajados[i];
                    System.out.println("Le tiene que hacer un regalo a " + agasajados[j] + " presiona LISTO para continuar");

                    //Quitar de la lista de agasajados el nombre del agasajado asignado
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                }
            }
        }
    }
}


//listFriends = [Marco, Diana]
//agasajados = [Marco, Diana]

//Primer for (1)reccorido 0 = Marco
//Segundo for (2) = agasajados
//Primer if = Marco
//Si Marco != Marco, entonces no se le asigna el asignado.
//Segundo if = Diana
//Si Marco != Diana, entonces se le asigna el asignado
//Ahora a la lista agasajados se le debe quitar o excluir a DIANA
//Entonces la nueva lista de agasajados = [Marco]
//Finaliza el proceso.
//Segundo for (1) recorrido 1 = Diana
//Segundo for (2) = agasajados = [Marco]
//Primer if = Diana
//Si Diana(listFriends) != Marco(agasajados), entonces se le asigna el agasajado
//Ahora la lista de agasajados, queda VACIA POR QUE NO TIENES A QUIEN ASIGNAR Y FINALIZA EL PROCESO.



