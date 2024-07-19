
package poo.clasabstract;

//Declaramos la clase como abstracta
public abstract class Figura {
    
    protected double x; //posicion en x
    protected double y; //posicion en y

    //Creamos un constructor vacio
    public Figura() {
    }

    //Constrctor con parametros
    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
   
    //Metodo abstracto declaramaos sin implementacion
    public abstract double calcularArea(); 
    
}
