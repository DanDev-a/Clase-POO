
package Encapsular;

public class Alumno {
    
    //Atributos de Alumno (Usamos el modificador de acceso private)
    //Todos los atributos de una clase deben ser privados por estandar para
    //protegerlos y que no cualquier clase pueda acceder a ellos
    private int id;
    private String nombre;
    private String apellido;

    //Constructor vacio
    //Usaremos el modificador de acceso
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

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
    
    
}
