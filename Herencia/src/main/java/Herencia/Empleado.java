
package Herencia;

//Para que EMPLEADO herede PERSONA añadimos la palabra EXTENDS
//despues de EMPLEADO seguido de PERSONA o lo que queramos que herede
public class Empleado extends Persona {
    
    int num_legajo;
    String cargo;
    Double sueldo;

    //Constructor vacio
    public Empleado() {
    }

    //Constructor con atributos propios y heredados de PERSONA 
    //la palabra SUPER nos llama al constructor  
    public Empleado(int num_legajo, String cargo, Double sueldo, int id, 
            String dni, String nombre, String apellido, String domicilio, 
            String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.num_legajo = num_legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
    
    
    
}
