//@author Diego Alexander Gaviria Jimenez
package clases;
//librerias
//------Conexion a la base de datos------\\
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;


//------ingrseando datos  a la base de datos------\\
import java.util.ArrayList;

import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;

      
/**
 * 
 * @author Diego Alexander Gaviria Jimenez
 * En esta Clase permite la conección con la base de datos
 * se encontrara con metodos para insert delete select y conectar desconectar
 */
public class connection_mysql {
    
private static Connection conexion;
     
      
    private  String usuario_mysql;
    private  String password_mysql;
    private  String nombre_baseD;
    private  String tabla;
      
    //costructores 2
    public  connection_mysql(){}
       
    /**
     * @param usuario_mysql usuario de la base de datos -> ejemplo root
     * @param password_mysql contraseña de la base de daros -> ejemplo 1234  
     * @param nombre_baseD  nombre de la base de datos -> escuela
    */  
    public  connection_mysql(String usuario_mysql,String password_mysql, String nombre_baseD){
         
        this.usuario_mysql = usuario_mysql;
        this.password_mysql = password_mysql;
        this.nombre_baseD = nombre_baseD;
      
    }
    public  connection_mysql(String tabla){
    this.tabla = tabla;
    }
    public  connection_mysql(String usuario_mysql,String password_mysql, String nombre_baseD,String tabla){
    
        this.usuario_mysql = usuario_mysql;
        this.password_mysql = password_mysql;
        this.nombre_baseD = nombre_baseD;
        this.tabla = tabla;
    } 
    
    //metodos conexion a la base de datos 3
    /**
     * se conecta a la base de datos
     * @param usuario_mysql
     * @param nombre_baseD
     * @param password_mysql 
     * 
     */
    public void MySQL_connection(String usuario_mysql, String nombre_baseD, String password_mysql){
    
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/" + nombre_baseD,usuario_mysql,password_mysql);
            System.out.println("Se ha iniciado la conexión de forma exitosa");
        }catch(ClassNotFoundException | SQLException ex ){
            Logger.getLogger(connection_mysql.class.getName()).log(Level.SEVERE, null, ex );   
        }      
    }
    
    /** 
    se conecta a la base de datos con ayuda del contructor 
    */
    public void MySQL_connection(){
        
        
    
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/" + nombre_baseD,usuario_mysql,password_mysql);
            System.out.println("Se ha iniciado la conexión de forma exitosa");
        }catch(ClassNotFoundException | SQLException ex ){
            Logger.getLogger(connection_mysql.class.getName()).log(Level.SEVERE, null, ex );   
        }      
    }
    
    /**
     * @return Connetion
    */
    public Connection conectar(){
        Connection con = null;
       
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/" + nombre_baseD,usuario_mysql,password_mysql);
            System.out.println("En linea");
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
        return conexion;
    }
    
    //metodos cerrar conexion 1
    /**
    * cierra la conección
    */
    public void cerrar_connection(){
        try{
            conexion.close();
        }catch(SQLException ex){
            Logger.getLogger(connection_mysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //9 metodos trae los datos usand select * from datos 
   
    /**
     * trae los datos de la base de datos -> localidades
     * @param nombreTabla
     * @return 
    */
    public localidades getUser(String nombreTabla) {
        localidades loc = null; // El usuario no existe en esta base de datos
        try {
            String Query = "SELECT * FROM " + nombreTabla;
            Statement st = conexion.createStatement();
            ResultSet resultSet;
            resultSet = st.executeQuery(Query);
             while (resultSet.next()) {
                    loc = new localidades();
                    int ID=0;
                    loc.setID(resultSet.getInt("ID"));
                    loc.setLocalidades(resultSet.getString("Localidades"));
                    loc.setDificultad_loc(resultSet.getString("Dificultad_loc"));
                    loc.setPorcentaje(resultSet.getDouble("porcentaje"));
                    loc.setFecha(resultSet.getString("fecha"));
            }       
               
        } catch (SQLException ex) {
            loc = null; // Error al intentar adquirir los datos
        }
        return loc;
    }
   
    //trae los datos en array list ->usuarios
    public ArrayList getvalues(String nombreTabla){
     ArrayList<localidades> localidad = new ArrayList<>();
        
      try {
            String Query = "SELECT * FROM " + nombreTabla;
            Statement st = conexion.createStatement();
            ResultSet resultSet;
            resultSet = st.executeQuery(Query);
            while (resultSet.next()) {
                
                localidades rs = new localidades();
            //    rs.setID(resultSet.getInt("ID"));
                System.out.println(rs.getID());
                
                rs.setLocalidades(resultSet.getString("Localidaes"));
                System.out.println(rs.getLocalidades());
                
                rs.setDificultad_loc(resultSet.getString("Dificultad"));
                System.out.println(rs.getLocalidades());
                
                rs.setFecha(resultSet.getString("Fecha"));
                System.out.println(rs.getFecha());
                
                
                //rs.setPorcentaje(resultSet.getDouble("Porcentaje"));
                System.out.println(rs.getPorcentaje());
                localidad.add(rs);
            }
 
        } catch (SQLException ex) {
            localidad = null;
        }
        
        return localidad;
    }
    //trae los datos en array list ->reserva
    
   //trae el nombre del usuario
    public String getNombre(String ID){
        String nombre = "";
        try{
            String Query = "SELECT Nombre FROM usuarios" + " WHERE ID = " + ID;
            Statement st = conexion.createStatement();
            ResultSet rS;
            rS = st.executeQuery(Query);
            rS.next();
            nombre = rS.getString("Nombre");
        }catch (SQLException ex){
            System.out.println(ex);
        }
        System.out.println("el nombre del usuarios es: "+nombre);
        return nombre;
    }
    //trae el apellido del usuario
    public String getApellido(String ID){
        String nombre = "";
        try{
            String Query = "SELECT * FROM usuarios" + " WHERE ID = " + ID;
            Statement st = conexion.createStatement();
            ResultSet rS;
            rS = st.executeQuery(Query);
            rS.next();
            nombre = rS.getString("Apellido");
        }catch (SQLException ex){
            System.out.println(ex);
        }
        return nombre;
    }
    //trae el genero del usuario
    public String getSexo(String ID){
        String nombre = "";
        try{
            String Query = "SELECT Sexo FROM usuarios" + " WHERE ID = " + ID;
            Statement st = conexion.createStatement();
            ResultSet rS;
            rS = st.executeQuery(Query);
            rS.next();
            nombre = rS.getString("Sexo");
        }catch (SQLException ex){
            System.out.println(ex);
        }
        return nombre;
    }
    //trae el iD del usuario    
    public String getID(String ID){
        
        String nombre = "";
        try{
        String Query = "SELECT ID FROM usuarios" + " WHERE ID = " + ID;
            Statement st = conexion.createStatement();
            ResultSet rS;
            rS = st.executeQuery(Query);
            rS.next();
            nombre = rS.getString("Sexo");
        }catch (SQLException ex){
            System.out.println(ex);
        }
        return nombre;
    } 
    
   /**
     * inserta datos -> tabla localidades
     * @param Nom_tabla
     * @param ID
     * @param Localidad
     * @param dificultad_loc
     * @param porcentaje
     * @param fech
     * @return int
    */
   public int insertdato(String Nom_tabla, int ID, String Localidad,String dificultad_loc, double porcentaje,String fech){
  
        int estatus = 0;
   
        try{
            String Query = "INSERT INTO " + Nom_tabla + " VALUES("
                + "\"" + ID + "\", "
                + "\"" + Localidad + "\", "
                + "\"" + dificultad_loc + "\", "
                + "\"" + porcentaje + "\", "
                + "\"" + fech + "\")";
                Statement st = conexion.createStatement();
                st.executeUpdate(Query);
                estatus=1; //el dato se agrego exitosamente
        }catch(SQLException ex){
            estatus=0; //error al agredar el dato
            System.out.print(estatus);
        }   
        return estatus;
    }
   
   /**
    * Metotodo utilizado para guardar datos en la base de datos
    * ADVERTENCIA debe realizar la conexion a la base de datos con el metodo MySQL_connection
    * y existir una tabla con 6 atributos en la base de datos
    * 
    * if(estatus != 0) realizar esta condición 
    * 
     * @param Nom_tabla nombre de la tabla a guardar dato
     * @param ID    
     * @param Telefono
     * @param Correo
     * @param Nombre
 
     * @param Direccion
     * @param Genero
     * @param Apellido
    
     * @return int si devuelve 1 el dato se agrega y devuelve 0 el dato no se agrega
   */
   public int insertdato(String Nom_tabla, int ID,int Telefono,String Correo,String Nombre,
            String Direccion,String Genero,String Apellido){
  
        int estatus = 0;
       
   
        try{
            String Query = "INSERT INTO " + Nom_tabla + " VALUES("
                + "\"" + ID + "\", "
                + "\"" + Nombre + "\", "
                + "\"" + Apellido + "\", "
                + "\"" + Telefono + "\", "
                + "\"" + Correo + "\", "
                + "\"" + Direccion + "\", "
                + "\"" + Genero + "\")";    
           
                Statement st = conexion.createStatement();
                st.executeUpdate(Query);
                estatus=1; //el dato se agrego exitosamente
        }catch(SQLException ex){
            estatus=0; //error al agredar el dato
            System.out.print("el dato no se agrego el estado actual es " + estatus);
            System.err.println("error al guardar datos es >>"+ex);
        }   
        return estatus;
    }
   
        
    public int Insert_encuestas(String Nom_tabla, String Nombre, String Correo,int Telefono, 
                              int Localidad,int Problema,String ID) {

        int estatus = 0;
     

        try {
            String Query = "INSERT INTO " + Nom_tabla + " VALUES("
                    + "\"" + ID + "\", "
                    + "\"" + Nombre + "\", "
                    + "\"" + Correo + "\", "
                    + "\"" + Telefono + "\", "
                    + "\"" + Localidad + "\", "
                    + "\"" + Problema + "\")";

            Statement st = conexion.createStatement();
            st.executeUpdate(Query);
            estatus = 1; //el dato se agrego exitosamente
        } catch (SQLException ex) {
            estatus = 0; //error al agredar el dato
            System.out.print(estatus);
            System.out.println("no se pudo agregar el usuario ");
        }
        return estatus;
    }
  
     
    //metos mostrar datos 1 
    /**
     * Metodo utilizado para visualizar los datos 
     * ADVERTENCIA debe realizar la conexion a la base de datos con el metodo MySQL_connection
     * @param tabla nombre de la tabla
     * @return si retorna null no se puedo visualizar los datos
    */
    public ResultSet visualizar(String tabla){
        
        ResultSet rs = null;
        try{
          //  PreparedStatement ps = conexion.prepareStatement("select * from localidades");
          PreparedStatement ps = conexion.prepareStatement("select * from " + tabla);
            rs = ps.executeQuery();
        }catch(Exception ex){
            System.out.println("Error de consulta");
            System.err.println("error");
        }
        return rs;
    }
    //metodos eliminar datos 1
    /** 
    * Metodo utilizado para eliminar datos 
    * @param name nombre de la llave primaria
    * @param tabla nombre de la tabla que perenece la llave primaria
    */
    public void Delete(String name,String tabla){
   
    try {  
       Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection;
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/" + nombre_baseD,usuario_mysql,password_mysql);
        PreparedStatement st = connection.prepareStatement("DELETE FROM " + tabla + " WHERE ID = ?");
       
        st.setString(1,name);
        st.executeUpdate(); 
        System.out.println("se eliminno el dato "+name);
        JOptionPane.showMessageDialog(null,"se eliminno el dato "+name);
    } catch(ClassNotFoundException | SQLException e) {
        System.out.println(e);
        System.out.println("no se pudo eliminar el dato "+name);
        JOptionPane.showMessageDialog(null,"no se pudo eliminar el dato "+name);
    }
    
    
}
 
    /**
    *
    *Método utilizado para realizar las instrucciones: INSERT, DELETE y UPDATE
    *@param sql Cadena que contiene la instrucción SQL a ejecutar
    *@return estado regresa el estado de la ejecución, true(éxito) o false(error)
    *
    */
    public boolean ejecutarSQL(String sql)
    {
       try {
           PreparedStatement sentencia = conexion.prepareStatement(sql);
          sentencia.execute(sql);
          return true;
       } catch (SQLException ex) {
            return false;
       }
    }
    
    /**
     * actualiza datos
     * @param ID   
     * @param atributo     
     * @return      
    */
    public String getDato(String ID, String atributo){
        String nombre = "";
        try{
            String Query = "SELECT " + atributo + " FROM encuestas" + " WHERE ID = " + ID;
            Statement st = conexion.createStatement();
            ResultSet rS;
            rS = st.executeQuery(Query);
            rS.next();
            nombre = rS.getString(""+ atributo +"");
        }catch (SQLException ex){
            System.out.println(ex);
        }
        return nombre;
    }
    
    
      public void setDato(String ID, String atributo, String num_valor){
        try{
            String Query = "UPDATE encuestas SET " +  atributo + " = " + "'" + num_valor + "'" + " WHERE ID = " + ID;
            //System.out.println(Query);
            Statement st = conexion.createStatement();
            st.executeUpdate(Query);
        }catch (SQLException ex){
            System.out.println(ex);
        }
    }
      
    public void setNum(String ID, String atributo, int num_valor){
        try{
            String Query = "UPDATE encuestas SET " +  atributo + " = " + "'" + num_valor + "'" + " WHERE ID = " + ID;
            Statement st = conexion.createStatement();
            st.executeUpdate(Query);
        }catch (SQLException ex){
            System.out.println(ex);
        }
    }

       public Usuario getDt_usuario(String tabla,String ID,String Password){
      
   Usuario usuario = null; // El usuario no existe en esta base de datos
        try {
            String Query = "SELECT * FROM " + tabla;
            Statement st = conexion.createStatement();
            ResultSet resultSet;
            resultSet = st.executeQuery(Query);
 
            while (resultSet.next()) {
                if(resultSet.getString("ID").equals(ID) && resultSet.getString("Contraseña").equals(Password)){
                    // El usuario existe en esta base de datos
                    usuario = new Usuario();
                    usuario.setID(resultSet.getString("ID"));
                    usuario.setPassword(resultSet.getString("Contraseña"));
                    usuario.setNombre(resultSet.getString("Nombre"));
                    usuario.setApellido(resultSet.getString("Apellido"));
                  //  usuario.setEdad(resultSet.getString("Edad"));
                    usuario.setSexo(resultSet.getString("genero"));
                    break;
                }
            }
        }catch(SQLException ex){
               usuario=null;
                System.out.println(usuario);
                System.err.println("No se pudo traer el usuario"+ex);
            }
        return usuario;
    }    
} 
