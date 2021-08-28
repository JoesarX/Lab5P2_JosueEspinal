package lab6p2_josueespinal;
public class Docente extends persona{
    private String tituloPre;
    private String tituloMa;
    private int alumnos;
    private String clase;
    private String descripcion;

    public Docente() {
        super();
    }

    public Docente(String tituloPre, String tituloMa, int alumnos, String clase, String descripcion) {
        this.tituloPre = tituloPre;
        this.tituloMa = tituloMa;
        this.alumnos = alumnos;
        this.clase = clase;
        this.descripcion = descripcion;
    }

    public String getTituloPre() {
        return tituloPre;
    }

    public void setTituloPre(String tituloPre) {
        this.tituloPre = tituloPre;
    }

    public String getTituloMa() {
        return tituloMa;
    }

    public void setTituloMa(String tituloMa) {
        this.tituloMa = tituloMa;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Docente{" + "tituloPre=" + tituloPre + ", tituloMa=" + tituloMa + ", alumnos=" + alumnos + ", clase=" + clase + ", descripcion=" + descripcion + '}';
    }
    
}
