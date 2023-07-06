package clase_13_02;

public class Mago extends PersonajeBase{
    private String nombreHechizo;
    private int fuerzaHechizo;

    public String getNombreHechizo() {
        return nombreHechizo;
    }

    public void setNombreHechizo(String nombreHechizo) {
        this.nombreHechizo = nombreHechizo;
    }

    public int getFuerzaHechizo() {
        return fuerzaHechizo;
    }

    public void setFuerzaHechizo(int fuerzaHechizo) {
        this.fuerzaHechizo = fuerzaHechizo;
    }
}
