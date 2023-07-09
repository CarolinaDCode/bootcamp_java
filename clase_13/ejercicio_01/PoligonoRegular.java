package clase_13;

import java.util.Scanner;

public abstract class PoligonoRegular extends FiguraBase{
    protected double base;
    protected double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public abstract double calcularArea();
    public void dataLoad(){
        Scanner dataInput = new Scanner(System.in);

        System.out.println("Ingresa la Altura en cm:");
        altura = dataInput.nextDouble();

        System.out.println("Ingresa la Base en cm:");
        base = dataInput.nextDouble();
    }
}
