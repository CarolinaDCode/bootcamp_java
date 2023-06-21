package clase_10;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
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

    public void showDataAccount(){
        System.out.print("\nNombre del Titular: " + titular +
                         "\nCantidad: "  + cantidad);
    }

    public void quantityEnter(double cantidad){
        if(cantidad > 0){
          this.cantidad += cantidad;
        }
    }

    public void quantityOutput(double cantidadRetirada){
        this.cantidad -= cantidadRetirada;
    }
}
