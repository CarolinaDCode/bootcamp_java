package clase_13;

import java.util.Scanner;

public class Cuadrado extends FiguraBase{
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        double area = Math.pow(lado, 2);
        return area;
    }

    public void dataLoad() {
        Scanner dataInput = new Scanner(System.in);

        System.out.println("Ingresa el lado en cm:");
        lado = dataInput.nextDouble();
    }
}
