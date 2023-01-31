import Clases.Camion;
import Clases.Coche;
import Clases.Vehiculo;

public class Main {
    public static void main(String[] args){
        Vehiculo vehiculos[] = new Vehiculo[4];
        vehiculos[0] = new Camion("RTS0021");
        vehiculos[1] = new Coche("GTS0021",3);
        vehiculos[2] = new Camion("TYR9821");
        vehiculos[3] = new Coche("CRS7261",5);

        for (int i=0;i<vehiculos.length;i++){
            if(vehiculos[i] instanceof Camion){
                 ((Camion) vehiculos[i]).ponRemolque(5000);
            }
        }
        vehiculos[0].acelerar(130);
        vehiculos[1].acelerar(130);
        vehiculos[2].acelerar(90);
        vehiculos[3].acelerar(90);
        for (int j=0;j < vehiculos.length; j++){
            System.out.println(vehiculos[j]);
        }
    }
}