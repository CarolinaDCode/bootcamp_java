package clase_25.ejercicio_02;

public class Persona {
    private String nombre;
    private String dni;

    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String resumen(){
        return "Nombre: " + nombre + "\n" +
                "DNI " + dni + "\n" +
                "Teléfono: " + telefono + "\n";
    }
}
