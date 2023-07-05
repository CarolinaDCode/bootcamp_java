package clase_13_02;

public class PersonajeBase {
    private String  nombre;
    private String  nivel;
    private int puntosDeVida;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public void ataque(String nombre, String enemigo){
        System.out.println(nombre + " ataca a " + enemigo);
    }

    public void recibeDano(String nombre, int cantidad){
        puntosDeVida -= cantidad;
        System.out.println(nombre + " recibe daño y le quedan " + puntosDeVida + " puntos de vida");
    }

    public void curarse(String nombre, int cantidad){
        puntosDeVida += cantidad;
        System.out.println(nombre + " se esta curando y tiene " + puntosDeVida + " puntos de vida");
    }
}
