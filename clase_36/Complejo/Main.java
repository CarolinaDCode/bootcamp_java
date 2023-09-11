package clase_36.Complejo;
public class Main {
    public static void main(String[] args) {
        EstadoPaquete estadoPaquete = EstadoPaquete.SMALL_CANCELADO;
        if (estadoPaquete.esPequeno()) {
            System.out.println("Se perdio un paquete pequeño");
        }
    }
}

