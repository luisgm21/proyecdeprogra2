/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author SALA3
 */
public class AfiliadoExistenteException extends RuntimeException {
     public AfiliadoExistenteException(String mensaje) {
        super(mensaje);
    }
}
