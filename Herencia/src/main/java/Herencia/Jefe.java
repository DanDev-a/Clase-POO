
package Herencia;

public class Jefe extends Persona {
    
    //Atributos de Jefe
    int id_jefe;
    String departamento_jefe;

    //Constructor vacio
    public Jefe() {
    }

    //Constructor con atributos y herencia de Persona
    public Jefe(int id_jefe, String departamento_jefe, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.id_jefe = id_jefe;
        this.departamento_jefe = departamento_jefe;
    }
    
    //Getters and Setters 
    public int getId_jefe() {
        return id_jefe;
    }

    public void setId_jefe(int id_jefe) {
        this.id_jefe = id_jefe;
    }

    public String getDepartamento_jefe() {
        return departamento_jefe;
    }

    public void setDepartamento_jefe(String departamento_jefe) {
        this.departamento_jefe = departamento_jefe;
    }
    
    
}
