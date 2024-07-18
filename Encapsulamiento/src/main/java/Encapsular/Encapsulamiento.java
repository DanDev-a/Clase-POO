
package Encapsular;

public class Encapsulamiento {

    public static void main(String[] args) {
        
        //Si el constructor se pone en privado no se puede utilizar
        Alumno alu1 = new Alumno();
        
        //Se puede utilizar el constructor si es publico
        Alumno alu2 = new Alumno(15, "Fernando" , "Gutierrez");
        
        //mostramos los datos 
        System.out.println("Id: " + alu2.getId());
        System.out.println("Nombre: " + alu2.getNombre());
        System.out.println("Apellido: " + alu2.getApellido());
    }
}
