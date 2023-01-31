public class Camion extends Vehiculo{
    protected Remolque remolque = null;

    public Camion(String matricula) {
        super(matricula);
        super.velocidad=0;
    }
    public void ponRemolque(int peso){
        this.remolque = new Remolque(peso);
    }
    public void quitaRemolque(){
        this.remolque= null;
    }

    @Override
    public void acelerar(int velocidad) {
        super.acelerar(velocidad);
        if(this.remolque !=null){

        }
    }

    @Override
    public String toString() {
        return "Clases.Camion{" +
                "remolque=" + remolque +
                ", matricula='" + matricula + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
