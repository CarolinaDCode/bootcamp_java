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

    public void recibeDanio(String nombre, int cantidadDanio){
        puntosDeVida -= cantidadDanio;
        System.out.println(nombre + " recibe daño y le quedan " + puntosDeVida + " puntos de vida");
    }

    public void curarse(String nombre, int cantidadCura){
        puntosDeVida += cantidadCura;
        System.out.println(nombre + " se ha recuperado con " + cantidadCura + " puntos de curación y tiene " + puntosDeVida + " puntos de vida");
    }
}
