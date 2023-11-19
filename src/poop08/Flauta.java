/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop08;

/**
 *Clase que representa una flauta, que hereda de la clase InstrumentoViento.
 * 
 * Esta clase proporciona implementaciones específicas para el tipo de instrumento "flauta".
 * 
 * @author lilian
 */
public class Flauta extends InstrumentoViento {
    /**
     * Devuelve el tipo de instrumento, que es "flauta".
     * 
     * @return El tipo de instrumento, que es "flauta".
     */

    @Override
    public String tipoInstrumento() {
        return "flauta"; 
    }
     /**
     * Devuelve una representación en cadena del objeto Flauta.
     * 
     * @return Representación en cadena del objeto Flauta.
     */

    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
    
    
}
