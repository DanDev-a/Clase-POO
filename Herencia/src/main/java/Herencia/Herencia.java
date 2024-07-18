
package Herencia;

public class Herencia {

    public static void main(String[] args) {
        
        //Polimorfismo se puede almacenar a clases dependientes de
        //la clase Persona
        Persona vector [] = new Persona [5];
        vector [0] = new Persona();
        vector [1] = new Empleado(); 
        vector [2] = new Consultor();
        vector [3] = new Jefe();
        
        //No se necesita hacer Casteo de datos
        Persona perso = new Persona();
        Consultor consul = new Consultor();
        
        //solo se aplica si la asignacion es una clase dependiente a la clase main
        perso = consul;
    }
}
