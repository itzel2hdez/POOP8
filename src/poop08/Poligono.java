/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop08;

/**
 *Clase abstracta que representa un polígono genérico.
 * Esta clase es una clase base para representar polígonos y proporciona
 * métodos abstractos para calcular el área y el perímetro.
 * @author lilian
 */
public abstract class Poligono extends Object  {
    /**
     * Constructor por defecto de la clase Poligono.
     */
    public Poligono () {
    }
     /**
     * Método abstracto para calcular el área del polígono.
     * Este método debe ser implementado por las clases hijas.
     * 
     * @return El área del polígono.
     */
    public abstract int area();
     /**
     * Método abstracto para calcular el perímetro del polígono.
     * Este método debe ser implementado por las clases hijas.
     * 
     * @return El perímetro del polígono.
     */
    
    public abstract int perimetro();

    /**
     * Devuelve una representación en cadena del objeto Poligono.
     * 
     * @return Representación en cadena del objeto Poligono.
     */
    
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
}
