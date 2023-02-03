package Clases;

import Excepciones.DemasiadoRapidoException;

public abstract class Vehiculo {
    //atributos
    protected String matricula;
    protected int  velocidad ;

    /**
     * constructor al que se le pasa la matricula por parámetro
     * y pone la velocidad a 0
     * @param matricula
     */
    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }

    /**
     * metodo abstracto de acelerar
     * @param velocidad
     */
    public abstract void acelerar(int velocidad) throws DemasiadoRapidoException;

    //toString
    @Override
    public String toString() {
        return "Clases.Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
