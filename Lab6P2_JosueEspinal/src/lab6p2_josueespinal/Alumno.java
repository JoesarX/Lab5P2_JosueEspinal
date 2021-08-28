package lab6p2_josueespinal;
import java.util.ArrayList;

public class Alumno extends persona{
    private int cuenta;
    private int anio;
    private int clases;
    ArrayList<Prueba> pruebas = new ArrayList<Prueba>();

    public Alumno() {
        super();
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getClases() {
        return clases;
    }

    public void setClases(int clases) {
        this.clases = clases;
    }

    public ArrayList<Prueba> getPruebas() {
        return pruebas;
    }

    public void setPruebas(Prueba pruebas) {
        this.pruebas.add(pruebas);
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "cuenta=" + cuenta + ", anio=" + anio + ", clases=" + clases + '}';
    }
    
}
