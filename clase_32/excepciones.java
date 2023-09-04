package clase_32;

public class excepciones {
    public static void main(String[] args){
        Usuario usuario  = new Usuario();
        try {
            registrar(usuario);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("No se pudo registrar");
        }

    }
    public static void registrar(Usuario usuario) {
        if (usuario.getEmail() == null) {
            throw new IllegalArgumentException("El Email es obligatorio");
        }
        System.out.println("REGISTRAR");
    }
}
class Usuario {
    private String email;
    private String nombre;
    private String apellido;
    private String telefono;

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
