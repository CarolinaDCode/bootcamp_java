package clase_24.pipeline;

public class Persona {

    private String name;
    private int edad;

    private int salario;

    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }

    public int setEdad() {
        return salario;
    }

    public Persona setName(String name) {
        this.name = name;
        return this;
    }

    public Persona setEdad(Integer edad) {
        this.edad = edad;
        return this;
    }

    public Persona setSalario(Integer salario) {
        this.salario = salario;
        return this;
    }

    public Persona calcularSalario(){
        System.out.println("El salario es de 1500");
        return this;
    }
}
