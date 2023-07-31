package FigurasGeometricas;

public class Rectangulo implements FigurasGeometricas{

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
        return ancho * alto;
    }
}
