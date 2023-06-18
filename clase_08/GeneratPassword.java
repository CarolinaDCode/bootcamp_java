package clase_08;

import java.util.Random;

public class GeneratPassword {
    public static void main (String[] args){
        String newPassword = getPassword();
        System.out.println(newPassword);
    }

    private static String getPassword(){
        //Generate number random
        double numDecimal = Math.random() * 1000;
        long intRandom = Math.round(numDecimal);

        //Generate letters random
        String abcLower = "abcdefghijklmnopqrstuvwxyz";
        String abcUpper = "ABCDEFGHIJKLMNOPQRSTU";
        String abcAll = abcLower + abcUpper;

        Random mRandom = new Random();

        int abcLength = 4;
        String result = "";
        for (int i = 0; i < abcLength; i++) {
            int position  = mRandom.nextInt(abcAll.length());
            char caracter = abcAll.charAt(position);
            result += caracter;
        }
        return result + intRandom;
    }
}
