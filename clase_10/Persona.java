package clase_10;

import java.time.LocalDate;
import java.util.Date;

public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private String fechaNacimiento;
    private String dni;

    public Persona(int id, String nombre, int edad, String fechaNacimiento, String dni){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    /**
     * Métodos Getters y Setters
     */
    public int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(){
        this.edad = edad;
    }

    public String getFechaNacimiento(){
        return fechaNacimiento;
    }

    public void setFechaNacimiento(){
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni(){
        return dni;
    }

    public void setDni(){
        this.dni = dni;
    }

    /**
     * Métodos
     */
    public void showData(){
        System.out.print("\nNombre: " + nombre +
                         "\nEdad: "  + edad   +
                         "\nFecha de Nacimiento: "  + fechaNacimiento   +
                         "\nDNI: " + dni);
    }

    public Boolean isAdult(){
        return edad >= 18;
    }
}
