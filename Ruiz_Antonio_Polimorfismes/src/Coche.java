public class Coche extends Vehiculo{
    protected int numeroPuertas;

    public Coche(String matricula, int numeroPuertas) {
        super(matricula);
        super.velocidad=0;
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

}
