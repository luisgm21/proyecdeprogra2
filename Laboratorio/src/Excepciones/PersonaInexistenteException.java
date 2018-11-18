package Excepciones;

public class PersonaInexistenteException extends RuntimeException {
    public PersonaInexistenteException(String mensaje) {
        super(mensaje);
    }
}
