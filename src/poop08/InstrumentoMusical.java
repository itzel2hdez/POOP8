/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poop08;

/**
 *Interfaz que define el comportamiento de un instrumento musical.
 * 
 * Esta interfaz contiene métodos para tocar, afinar y obtener el tipo del instrumento.
 * Implementar esta interfaz implica proporcionar una implementación específica para cada uno de estos métodos.
 * 
 * @author lilian
 */

public interface InstrumentoMusical {
     /**
     * Método que define la acción de tocar el instrumento.
     * La implementación concreta de este método dependerá del tipo de instrumento.
     */
    void tocar();
    /**
     * Método que define la acción de afinar el instrumento.
     * La implementación concreta de este método dependerá del tipo de instrumento.
     */
    void afinar();
    /**
     * Método que devuelve el tipo del instrumento.
     * 
     * @return Una cadena que representa el tipo del instrumento.
     */
    String tipoInstrumento();         
}