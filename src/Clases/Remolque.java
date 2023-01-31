package Clases;

public class Remolque {
    //atributos
    protected int peso;

    /**
     * constructor donde se le pasa el peso por parametro
     * @param peso
     */
    public Remolque(int peso) {
        this.peso = peso;
    }
    //toString
    @Override
    public String toString() {
        return "Clases.Remolque{" +
                "peso=" + peso +
                '}';
    }
}
