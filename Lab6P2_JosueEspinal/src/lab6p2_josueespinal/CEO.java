package lab6p2_josueespinal;

public class CEO extends persona{
    private String titulo;
    private String ID;
    private int anios;
    private int edad;

    public CEO() {
        super();
    }

    public CEO(String titulo, String ID, int anios, int edad) {
        this.titulo = titulo;
        this.ID = ID;
        this.anios = anios;
        this.edad = edad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "CEO{" + "titulo=" + titulo + ", ID=" + ID + ", anios=" + anios + ", edad=" + edad + '}';
    }
    
    
}
