package Clases;

import Excepciones.DemasiadoRapidoException;

public class Camion extends Vehiculo {
    //atributos
    protected Remolque remolque = null;

    /**
     * constructor al cual se le pasa la matricula por parámetro
     * @param matricula
     */
    public Camion(String matricula) {
        super(matricula);
        super.velocidad=0;
    }

    /**
     * metodo que añade información a Clases.Remolque por lo que deja de
     * ser null
     * @param peso
     */
    public void ponRemolque(int peso){
        this.remolque = new Remolque(peso);
    }

    /**
     * metodo que pone remolque a null
     */
    public void quitaRemolque(){
        this.remolque= null;
    }
    /**
     * metodo que sobreescribe el método abstracto de Clases.Vehiculo.
     * Inserta en vehiculo el parametro introducido.
     * @param velocidad
     */
    @Override
    public void acelerar(int velocidad) throws DemasiadoRapidoException{
        if(this.remolque !=null && velocidad > 100){
            throw new DemasiadoRapidoException("Vas demasiado rapido");
        } else {
            this.velocidad = velocidad;
        }
    }
    //toString
    @Override
    public String toString() {
        if(this.remolque != null){
            return "Camion{" +
                    ", matricula='" + matricula + '\'' +
                    ", velocidad=" + velocidad + ", "
                     + remolque +
                    '}';
        }else {
            return "Camion{" +
                    ", matricula='" + matricula + '\'' +
                    ", velocidad=" + velocidad +
                    '}';
        }

    }
}
