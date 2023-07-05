package clase_13;

import java.util.Scanner;

public abstract class FiguraBase {
    private String colorFondo;

    public String getColorFondo() {
        return colorFondo;
    }
    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public abstract double calcularArea();

}
