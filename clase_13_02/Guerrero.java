package clase_13_02;

public class Guerrero extends PersonajeBase{

    private String tipoAtaque;
    private int fuerzaAtaque;

    public String getTipoAtaque() {
        return tipoAtaque;
    }

    public void setTipoAtaque(String tipoAtaque) {
        this.tipoAtaque = tipoAtaque;
    }

    public int getFuerzaAtaque() {
        return fuerzaAtaque;
    }

    public void setFuerzaAtaque(int fuerzaAtaque) {
        this.fuerzaAtaque = fuerzaAtaque;
    }
}
