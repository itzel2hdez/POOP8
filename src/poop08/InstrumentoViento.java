/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop08;

/**
 *Clase que representa un instrumento de viento. Implementa la interfaz InstrumentoMusical.
 * Extiende la clase Object de Java.
 * 
 * @author lilian
 */
public class InstrumentoViento extends Object implements InstrumentoMusical {

    /**
     * Constructor por defecto de la clase InstrumentoViento.
     */
    public InstrumentoViento() {
    }
    /**
     * Devuelve el tipo de instrumento de viento.
     * 
     * @return El tipo de instrumento de viento.
     */
    
    public String tipoInstrumentoViento(){
        return "instrumentoViento";
    }
    /**
     * Implementación del método tocar() de la interfaz InstrumentoMusical.
     * Muestra un mensaje indicando que se está tocando el instrumento de viento.
     */
    
    @Override
    public void tocar() {
        System.out.println("Tocar instrumento de viento ");
    }
    /**
     * Implementación del método afinar() de la interfaz InstrumentoMusical.
     * Muestra un mensaje indicando que se está afinando el instrumento de viento.
     */

    @Override
    public void afinar() {
        System.out.println("Afinar instrumento de viento ");
    }
    /**
     * Devuelve una representación en cadena del objeto InstrumentoViento.
     * 
     * @return Representación en cadena del objeto InstrumentoViento.
     */

    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    /**
     * Implementación del método tipoInstrumento() de la interfaz InstrumentoMusical.
     * 
     * @return El tipo de instrumento (no implementado).
     * 
     *
    */

    @Override
    public String tipoInstrumento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
