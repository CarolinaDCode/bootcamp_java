package clase_13.ejercicio_02;

import java.util.ArrayList;
import java.util.List;

public class PersonajeBase {
    protected String  nombre;

    protected String experiencia;
    protected int  level;
    protected int puntosDeVida;
    protected int mana;

    protected List<Items> items;

    public PersonajeBase() {
        puntosDeVida = 100;
        mana = 100;
        items = new ArrayList<>();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public void recibeDanio(String nombre, int cantidadDanio){
        puntosDeVida -= cantidadDanio;
        if(puntosDeVida < 0) {
            puntosDeVida = 0;
        }
        System.out.println(nombre + " recibe daño y le quedan " + puntosDeVida + " puntos de vida");
    }

    public boolean estaVivo(){
        return puntosDeVida <= 0 ? false : true;
    }

    public void curarse(String nombre, int cantidadCura){
        puntosDeVida += cantidadCura;
        System.out.println(nombre + " se ha recuperado con " + cantidadCura + " puntos de curación y tiene " + puntosDeVida + " puntos de vida");
    }

    public int getDefensaTotal(){
        int defensaTotal = 0;
        for (Items item : items) {
            defensaTotal += item.getDefensa();
        }
        return defensaTotal;
    }

    public int getAtaqueTotal(){
        int ataqueTotal = 0;
        for (Items item : items){
            if(item instanceof Arma){
                ataqueTotal += item.getAtaque();
            }
        }
        return ataqueTotal;
    }

    public int getMaximoPtsDevida(){
        return level * 5;
    }
}
