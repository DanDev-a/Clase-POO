
package Herencia;

//Hacemos que Consultor herede los atributos de Persona al
//igual que lo hicimos con empleado
public class Consultor extends Persona {
    
    String nombre_consultora;
    int numero_consultor;

    //Constructor vacio
    public Consultor() {
    }

    //Constructor con datos propios y heredados
    public Consultor(String nombre_consultora, int numero_consultor, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombre_consultora = nombre_consultora;
        this.numero_consultor = numero_consultor;
    }

    //Getters and Setters de la clase consultor
    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

    public int getNumero_consultor() {
        return numero_consultor;
    }

    public void setNumero_consultor(int numero_consultor) {
        this.numero_consultor = numero_consultor;
    }

    
}
