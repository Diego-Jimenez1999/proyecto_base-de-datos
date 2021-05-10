/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Asus-PC
 */
public class Usuario {
    
    //atributos
    private String ID;
    private String Password;
    private String nombre;
    private String apellido;
    private String edad;
    private String sexo;
    private String mes;
    private String imagen;
    private int dia;
    private int año;
    
    public Usuario(){}
    
    public Usuario(String imagen){
     this.imagen = imagen;
    }
    
    public Usuario(String ID, String Password){
        this.ID = ID;
        this.Password = Password;
        
    }
    
    /**
     * @param ID
     * @param Password
     * @param nombre
     * @param apellido
     * @param edad
     * @param sexo
    */
    public Usuario(String ID, String Password, String nombre, String apellido, String edad, String sexo){
        this.ID = ID;
        this.Password = Password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }

    /**
     * @param ID
     * @param Password
     * @param nombre
     * @param apellido
     * @param edad
     * @param sexo
     * @param mes
     * @param dia
     * @param año
    */ 
    public Usuario(String ID, String Password, String nombre, String apellido, String edad, String sexo, String mes, int dia, int año) {
        this.ID = ID;
        this.Password = Password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }
    
     //setters
    /**
     * @param ID
    */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
    * @param Password  
    */
    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    /**
     * @param nombre
    */
    public void setNombre(String nombre) {
        this.nombre = nombre ;
    }
    
    /**
     * @param apellido
    */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    /**
     * @param edad
    */
    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    /**
     * @param sexo
    */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    /** 
     * @param año
    */
    public void setAño(int año) {
        this.año = año;
    }
    
    /**
     * 
     * @param mes
    */
    public void setMes(String mes) {
        this.mes = mes;
    }
   
    
    /**
     * @param dia
    */
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public void setImagen(String imagen){
    
        this.imagen = imagen;
    
    }
    
 
    //getters
    
    /**
     * 
     * @return String
    */
    public String getID() {
        return ID;
    }
    
    
    /**
     * 
     * @return String
    */
    public String getPassword() {
        return Password;
    }
    
     
    /**
     * 
     * @return String
    */
    public String getNombre() {
        return nombre;
    }
    
    
    /**
     * 
     * 
     * @return String
    */
    public String getApellido() {
        return apellido;
    }

    
    /**
     * 
     * @return String
    */
    public String getEdad() {
        return edad;
    }

    
    /**
     * 
     * @return String
    */ 
    public String getSexo() {
        return sexo;
    }
    
    
    /**
     * 
     * @return int
    */ 
    public int getAño() {
        return año;
    }
    
    
    /**
     * 
     * @return int
    */
    public int getDia() {
        return dia;
    }
    
    
    /**
     * 
     * @return String
    */
    public String getMes() {
        return mes;
    }    
    
    public String
         getImagen(){
    
        return imagen;
    
    }

}
