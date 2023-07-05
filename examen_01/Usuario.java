package examen_01;

public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private int telefono;

    public Usuario(){};
    public Usuario(int id, String nombre, String apellido, String email, String password, int telefono){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setEmail(int telefono) {
        this.telefono = telefono;
    }

    public void impDatosUsuario(){
        System.out.print("\nId: " + id +
                "\nNombre: " + nombre +
                "\nApellido: "  + apellido +
                "\nEmail: "  + email   +
                "\nTeléfono: " + telefono);
    }
}
