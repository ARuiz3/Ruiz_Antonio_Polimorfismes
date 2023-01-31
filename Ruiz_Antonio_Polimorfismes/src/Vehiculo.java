import java.util.InputMismatchException;

public class Vehiculo {
    protected String matricula;
    protected int  velocidad ;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }
    public void acelerar(int velocidad){

    }

    @Override
    public String toString() {
        return "Clases.Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
