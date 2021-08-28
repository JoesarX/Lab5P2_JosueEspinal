package lab6p2_josueespinal;

public class Decano extends persona{
    private String tituloPre;
    private String ID;
    private int edad;
    private String tituloUni;
    private String tituloMa;

    public Decano() {
        super();
    }

    public Decano(String tituloPre, String ID, int edad, String tituloUni, String tituloMa) {
        this.tituloPre = tituloPre;
        this.ID = ID;
        this.edad = edad;
        this.tituloUni = tituloUni;
        this.tituloMa = tituloMa;
    }

    public String getTituloPre() {
        return tituloPre;
    }

    public void setTituloPre(String tituloPre) {
        this.tituloPre = tituloPre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTituloUni() {
        return tituloUni;
    }

    public void setTituloUni(String tituloUni) {
        this.tituloUni = tituloUni;
    }

    public String getTituloMa() {
        return tituloMa;
    }

    public void setTituloMa(String tituloMa) {
        this.tituloMa = tituloMa;
    }

    @Override
    public String toString() {
        return "Decano{" + "tituloPre=" + tituloPre + ", ID=" + ID + ", edad=" + edad + ", tituloUni=" + tituloUni + ", tituloMa=" + tituloMa + '}';
    }
    
    
}
