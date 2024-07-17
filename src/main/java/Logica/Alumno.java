//Molde para un alumno

package Logica;

public class Alumno {
    
    //Caracteristicas o atributos del alumno
    int id;
    String nombre;
    String apellido;

    //Se creo un constructor vacio
    public Alumno() {
    }

    //Se creo un constructor que recibe parametros
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Getters and setters se colocan antes de los metodos o despues de un constructor
    // get:Traer.obetenemos datos o verlos   set:Colocar.modificar   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    
    
    //Creamos un metodo
    public void mostrarNombre() {
        
        System.out.println("Hola, soy un alumno y se decir mi nombre"); 
    }
    
    //creamos otro metodo
    public void saberAprobado(double calificacion) {
        
        if(calificacion >= 61){
            System.out.println("Aprobe la materia");
        }else {
            System.out.println("Reprobe la materia");
        }
    }
}
