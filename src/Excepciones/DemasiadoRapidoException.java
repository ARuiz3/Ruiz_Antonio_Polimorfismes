package Excepciones;

public class DemasiadoRapidoException extends Exception{
    /**
     * Excepcion del tipo Excepciones.DemasiadoRapidoException
     * @param msg
     */
    public DemasiadoRapidoException(String msg){
        System.err.println(msg);
    }
}
