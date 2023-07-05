package examen_01;

public class Exercise_01 {

    public static void main(String[] args) {
        //Encuentra la suma de los números impares menores a 1000
        /**
        int sumaImpares = 0;
        for(int i=1; i < 1000; i+=2){
            sumaImpares += i;
        }
        System.out.println(sumaImpares);
        */

        //Encuentra la suma de los múltiplos de 3 menores a 1000
        int sumaDiv3 = 0;
        for(int j = 0; j < 1000; j++){
            if(j % 3 == 0){
                sumaDiv3 += j;
            }
        }
        System.out.println(sumaDiv3);
    }
}
