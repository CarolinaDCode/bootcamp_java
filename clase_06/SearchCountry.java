package clase_06;

import java.util.Scanner;

public class SearchCountry {

    public static void main(String[] args) {
        Scanner dataLoad = new Scanner(System.in);

        System.out.println("Por favor, ingrese el nombre de un pais");
        String country = dataLoad.nextLine();
        String urlCountry = "https://www.google.com/maps/search/" + country;

        System.out.println(urlCountry);
    }
}
