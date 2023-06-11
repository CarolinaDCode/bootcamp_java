package clase_06;

import java.util.Scanner;
public class InteractiveStory {
    public static void main(String[] args) {
        System.out.println("Titulo: Regreso a la Cueva del Tiempo");
        firstPart();
    }

    private static void firstPart() {
        Scanner dataLoad = new Scanner(System.in);
        System.out.println("Estas en una noche estrellada, te encuentras en un bosque misterioso:");
        System.out.println("¿Que haces?");
        System.out.println("1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante \n" +
                           "2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora");
        Integer inputOption = dataLoad.nextInt();
        secondPart(inputOption);
    }

    private static void secondPart(int option) {
        Scanner dataLoad = new Scanner(System.in);
        Integer inputOption;
        if (option == 1) {
            System.out.println("Exploras la oscuridad en busca de la fuente de un susurro escalofriante");
            System.out.println("continuas el camino y encuentras una cueva de donde proviene el susurro escalofriante \n" +
                               "ten cuidado no ingreses! \n" +
                               "FIN");
            System.exit(0);
        }else if (option == 2){
            System.out.println("Sigues el sendero iluminado hacia una pequeña cabaña acogedora \n" +
                               "Al llegar a la cabaña, te das cuenta de que hay dos puertas:");
            System.out.println("¿A cuál ingresas?");
            System.out.println("1) Entras por la puerta de la izquierda  \n" +
                               "2) Optas por la puerta de la derecha");
            inputOption = dataLoad.nextInt();
            thirdPart(inputOption);
        }else{
            System.out.println("Solo existen 2 opciones (1 y 2), por favor; ingresa una opción válida)");
            inputOption = dataLoad.nextInt();
            secondPart(inputOption);
        }
    }

    private static void thirdPart(int option){
        Scanner dataLoad = new Scanner(System.in);
        Integer inputOption;
        if(option == 1) {
            System.out.println("Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos. \n" +
                               "Te maravillas con las joyas y los objetos preciosos que llenan la sala. \n" +
                               "Te das cuenta de que has encontrado el legendario tesoro perdido del bosque. \n" +
                               "Con tu corazón lleno de emoción y riquezas, decides regresar a casa \n" +
                               "para compartir tu increíble aventura con el mundo.\n" +
                               "¡Felicidades, has tenido un final exitoso en tu búsqueda!\n" +
                               "FIN");
            System.exit(0);
        }else if (option == 2){
            System.out.println("Si decides optar por la puerta de la derecha \n" +
                               "Te encontrarás con una habitación muy oscura y fría, donde suelen ocurrir eventos paranormales\n" +
                               "habitación de la cuál nunca podrás salir ... \n" +
                               "FIN");
            System.exit(0);
        }else{
            System.out.println("Solo existen 2 opciones (1 y 2), por favor; ingresa una opción válida)");
            inputOption = dataLoad.nextInt();
            thirdPart(inputOption);
        }
    }
}
