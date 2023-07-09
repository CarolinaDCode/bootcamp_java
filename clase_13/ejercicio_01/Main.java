package clase_13.ejercicio_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<FiguraBase> figuras = new ArrayList<>();
    public static void main(String[] args){
        menuFiguras();
    }

    private static void menuFiguras(){
        Boolean stateMenu = true;

        while(stateMenu){
            System.out.println("\n******** MENU ***********");
            System.out.println("1) Crear una figura");
            System.out.println("2) Mostrar la sumatoria del area de las figuras");
            System.out.println("3) Salir");

            Scanner dataInput = new Scanner(System.in);
            int rptaUsuario = dataInput.nextInt();

            switch(rptaUsuario) {
                case 1:
                    crearFigura();
                    break;
                case 2:
                    sumatoriaAreas();
                    break;
                case 3:
                    stateMenu = false;
                    break;
            }
        }
    }

    private static void sumatoriaAreas(){
        double sumatoria = 0;
        for (FiguraBase figura : figuras){
            sumatoria += figura.calcularArea();
        }
        if (sumatoria == 0){
            System.out.println("Debe crear al menos una figura");
        }else{
            System.out.println("La suma de todas las areas es: " + sumatoria);
        }

    }

    private static void crearFigura() {
        System.out.println("¿Que figura deseas crear?");
        System.out.println("1) Cuadrado");
        System.out.println("2) Rectangulo");
        System.out.println("3) Triangulo");
        System.out.println("4) Circulo");

        Scanner dataInput = new Scanner(System.in);
        int rptaUsuario = dataInput.nextInt();

        switch(rptaUsuario) {
            case 1:
                Cuadrado formCuad = new Cuadrado();
                formCuad.dataLoad();
                System.out.println("El area del Cuadrado es: " + formCuad.calcularArea());
                figuras.add(formCuad);
                break;
            case 2:
                Rectangulo formRect = new Rectangulo();
                formRect.dataLoad();
                System.out.println("El area del Rectangulo es: " + formRect.calcularArea());
                figuras.add(formRect);
                break;
            case 3:
                Triangulo formTri = new Triangulo();
                formTri.dataLoad();
                System.out.println("El area del Triangulo es: " + formTri.calcularArea());
                figuras.add(formTri);
                break;
            case 4:
                Circulo formCirc = new Circulo();
                formCirc.dataLoad();
                System.out.println("El area del Circulo es: " + formCirc.calcularArea());
                figuras.add(formCirc);
                break;
        }
    }
}
