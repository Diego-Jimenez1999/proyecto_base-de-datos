
package clases;

public class localidades {
    //atributos
    private int ID;
    private String Localidades;
    private String dificultad_loc;
    private double porcentaje;
    private String  fecha;
    
    //constructor
    public localidades(){}
    public localidades(int ID, String Localidades, String dificultad_loc, double porcentaje, String fecha) {
        this.ID = ID;
        this.Localidades = Localidades;
        this.dificultad_loc = dificultad_loc;
        this.porcentaje = porcentaje;
        this.fecha = fecha;
    }
    
    
    public int getID() {
        
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLocalidades() {
        return Localidades;
    }

    public void setLocalidades(String Localidades) {
        this.Localidades = Localidades;
    }

    public String getDificultad_loc() {
        return dificultad_loc;
    }

    public void setDificultad_loc(String dificultad_loc) {
        this.dificultad_loc = dificultad_loc;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    

   
    
    
    
    
    
}
