package Animales;

public class Pato extends Ave implements Nadador{

    public void nadar() {
        System.out.println("El pato nada bien");
    }

    public void aletear() {
        System.out.println("El pato aletea masomenos");
    }

    public void planear() {
        System.out.println("El pato planea masomenos");
    }
}
