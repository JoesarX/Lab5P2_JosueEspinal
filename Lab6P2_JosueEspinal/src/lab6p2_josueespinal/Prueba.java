package lab6p2_josueespinal;

public class Prueba {
   private String quipo;
   private String cooperacion;
   private String participacion;
   private String aprobado;
   private int evaluacion;
   private String nombre;
   private String apellido;

    public Prueba() {
    }

    public Prueba(String quipo, String cooperacion, String participacion, String aprobado, int evaluacion, String nombre, String apellido) {
        this.quipo = quipo;
        this.cooperacion = cooperacion;
        this.participacion = participacion;
        this.aprobado = aprobado;
        this.evaluacion = evaluacion;
        this.nombre = nombre;
        this.apellido = apellido;
    }


    public String getQuipo() {
        return quipo;
    }

    public void setQuipo(String quipo) {
        this.quipo = quipo;
    }

    public String getCooperacion() {
        return cooperacion;
    }

    public void setCooperacion(String cooperacion) {
        this.cooperacion = cooperacion;
    }

    public String getParticipacion() {
        return participacion;
    }

    public void setParticipacion(String participacion) {
        this.participacion = participacion;
    }

    public String getAprobado() {
        return aprobado;
    }

    public void setAprobado(String aprobado) {
        this.aprobado = aprobado;
    }

    public int getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(int evaluacion) {
        this.evaluacion = evaluacion;
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
        return "Prueba{" + "quipo=" + quipo + ", cooperacion=" + cooperacion + ", participacion=" + participacion + ", aprobado=" + aprobado + ", evaluacion=" + evaluacion + '}';
    }
   
}
