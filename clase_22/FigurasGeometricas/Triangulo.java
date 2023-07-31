package FigurasGeometricas;

public class Triangulo implements FigurasGeometricas{
    private float ancho;
    private float alto;

    public float getAncho() {
        return ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }
    public float calcularArea() {
        return ancho * alto / 2;
    }
}
