//Molde para un alumno

package Logica;

public class Alumno {
    
    //Caracteristicas o atributos del alumno
    int id;
    String nombre;
    String apellido;
    
    
    //Creamos un metodo
    public void mostrarNombre() {
        
        System.out.println("Hola, soy un alumno y se decir mi nombre"); 
    }
    
    public void saberAprobado(double calificacion) {
        
        if(calificacion >= 61){
            System.out.println("Aprobe la materia");
        }else {
            System.out.println("Reprobe la materia");
        }
    }
}
