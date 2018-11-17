
package Excepciones;


public class PersonaExistenteException extends RuntimeException {
    public PersonaExistenteException(String mensaje) {
        super(mensaje);
    }
}
