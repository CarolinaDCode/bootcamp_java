package Animales;

public class Main {
    public static void main(String[] args) {
        Gorrion gorrion = new Gorrion();
        gorrion.aletear();
        gorrion.planear();

        PezBetta pezBetta = new PezBetta();
        pezBetta.nadar();

        Pato pato = new Pato();
        pato.nadar();
        pato.aletear();
        pato.planear();

        //Polimorfismo
        Volador volador = gorrion;
        Nadador nadador = pato;
    }
}