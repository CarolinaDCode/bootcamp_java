package clase_06;

import java.util.Scanner;

public class CallWhatsApp {
    public static void main(String[] args){
        Scanner dataLoad = new Scanner(System.in);

        System.out.println("Por favor, ingrese el número al que desea llamar (sin espacios):");
        String numCellphone = dataLoad.nextLine();

        String callCellphone = "https://api.whatsapp.com/send?phone=" + "51" + numCellphone;

        System.out.println(callCellphone);
    }
}
