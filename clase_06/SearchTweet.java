package clase_06;

import java.util.Scanner;

public class SearchTweet {

    public static void main(String[] args){
        Scanner dataLoad = new Scanner(System.in);

        System.out.println("Por favor, el nombre de un famoso (1 palabra)");
        String celebrity = dataLoad.nextLine();
        String urlTweetFamous = "https://twitter.com/search?q=" + celebrity;

        System.out.println(urlTweetFamous);
    }
}
