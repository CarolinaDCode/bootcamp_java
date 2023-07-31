package FigurasGeometricas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FigurasGeometricas> figuras = new ArrayList<>();

        Triangulo triangulo = new Triangulo();
        triangulo.setAlto(10);
        triangulo.setAncho(5);
        figuras.add(triangulo);

        Circulo circulo = new Circulo();
        circulo.setRadio(8);
        figuras.add(circulo);

        float areaTotal = triangulo.calcularArea();
        System.out.println("Area total: " + areaTotal);

        for (FigurasGeometricas firgura: figuras){
            System.out.println("Area total: " + firgura.calcularArea());
        }
    }
}
