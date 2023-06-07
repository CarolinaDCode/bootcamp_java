package clase_05;

import java.util.Scanner;

public class CalculadoraEdadPerro {
    public static void main(String[] args){
        Scanner dataLoad = new Scanner(System.in);

        System.out.println("Ingrese los años 'Humanos' de su perro");
        Integer ageHuman = dataLoad.nextInt();
        Integer ageDog = 7;

        if (ageHuman > 0) {
            Integer ageDogReal = ageHuman * ageDog;
            System.out.println("La edad en años perro es: " + ageDogReal);
        } else {
            System.out.println("Ingrese un número mayor");
        }
    }
}
