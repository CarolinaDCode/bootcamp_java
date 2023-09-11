package clase_36.Sencillo;

public class Main {
    public static void main(String[] args) {
        Clima climaDeHoy = Clima.SOLEADO;

        switch (climaDeHoy) {
            case PARCIALMENTE_NUBLADO:
                System.out.println("Hoy esta parcialmente nublado");
                break;
            case NIEVE:
                System.out.println("Hoy parece que va a nevar");
                break;
            case SOLEADO:
                System.out.println("Hoy va a estar soleado");
                break;


        }
    }
}
