
package Logica;

public class POO {

    public static void main(String[] args) {
        
        //Constructor vacio
        Alumno alu1 = new Alumno();
        
        //Segundo constructor con atributos
        Alumno alu2 = new Alumno(5 , "Rick" , "Grimes"); 
        
        //muestras el ID,NOMBRE,APELLIDO con el uso de get
        System.out.println("La id del alumno2 es: " + alu2.getId());
        System.out.println("El nombre del alumno2 es: " + alu2.getNombre());
        System.out.println("El apellido del alumno2 es: " + alu2.getApellido());
        
        //Usamos "SET" para asignar valores al constructor vacio
        alu1.setId(8);
        alu1.setNombre("Jhon");
        alu1.setApellido("Wick");
        
        //Mostramos los datos asignados anteriormente
        System.out.println("---------------------------------");
        System.out.println("La ID del alumno1 es: " + alu1.getId());
        System.out.println("El nombre del alumno1 es: " + alu1.getNombre());
        System.out.println("El apellido del alumno1 es " + alu1.getApellido());
        
        
        //cambio de valor del ID con set y mostramos el cambio
        alu2.setId(35);
        System.out.println("---------------------------------");
        System.out.println("La id del alumno2 es: " + alu2.getId());
        System.out.println("El nombre del alumno2 es: " + alu2.getNombre());
        System.out.println("El apellido del alumno2 es: " + alu2.getApellido());
        
        
        
    }
}
