
package Logica;

public class POO {

    public static void main(String[] args) {
        
        //Constructor vacio
        Alumno alu1 = new Alumno();
        
        //Segundo constructor con atributos
        Alumno alu2 = new Alumno(35 , "Rick" , "Grimes"); 
        
        //muestras el ID,NOMBRE,APELLIDO con el uso de get
        System.out.println("La id del alumno2 es: " + alu2.getId());
        System.out.println("El nombre del alumno2 es: " + alu2.getNombre());
        System.out.println("El apellido del alumno2 es: " + alu2.getApellido());
        
    }
}
