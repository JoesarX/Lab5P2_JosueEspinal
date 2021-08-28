package lab6p2_josueespinal;
public class persona {
    private String usuario;
    private String password;
    private String nombre;
    private String apellido;

    public persona() {
    }

    public persona(String usuario, String password, String nombre, String apellido) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    @Override
    public String toString() {
        return "persona{" + "usuario=" + usuario + ", password=" + password + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
}
