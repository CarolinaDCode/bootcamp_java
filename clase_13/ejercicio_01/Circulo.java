package clase_13.ejercicio_01;

import java.util.Scanner;

public class Circulo extends FiguraBase {

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {

        this.radio = radio;
    }

    public double calcularArea() {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public void dataLoad() {
        Scanner dataInput = new Scanner(System.in);

        System.out.println("Ingresa el radio en cm:");
        radio = dataInput.nextDouble();
    }
}
