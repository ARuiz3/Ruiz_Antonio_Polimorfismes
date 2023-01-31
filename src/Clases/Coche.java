package Clases;

public class Coche extends Vehiculo {
    //atributos
    protected int numeroPuertas;

    /**
     * constructor donde se deben pasar por parametros tanto la matricula como el número de puertas
     * @param matricula
     * @param numeroPuertas
     */
    public Coche(String matricula, int numeroPuertas) {
        super(matricula);
        super.velocidad=0;
        this.numeroPuertas = numeroPuertas;
    }
    //Getter de numeroPuertas
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    /**
     * metodo que sobreescribe el método abstracto de Clases.Vehiculo.
     * Inserta en vehiculo el parametro introducido.
     * @param velocidad
     */
    @Override
    public void acelerar(int velocidad) {
        this.velocidad = velocidad;
    }

    //toString
    @Override
    public String toString() {
        return "Coche{" +
                "numeroPuertas=" + numeroPuertas +
                ", matricula='" + matricula + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
