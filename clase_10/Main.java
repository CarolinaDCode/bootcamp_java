package clase_10;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Persona person = new Persona(0, "Diana", 31, "03-06-1992", "71658340");
        person.showData();
        person.isAdult();

        Cuenta titular = new Cuenta("Diana Carhuamanta", 500.00);
        titular.showDataAccount();
        titular.quantityEnter(150.00);
        titular.quantityOutput(50.00);
    }
}
