package clase_10;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad){
        this.titular = "";
        this.cantidad = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

}
