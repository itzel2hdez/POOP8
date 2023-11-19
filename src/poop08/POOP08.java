/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop08;

/**
 *Clase principal que demuestra el uso de polimorfismo en Java.
 * @author lilian
 */
public class POOP08 {
    /**
     * Punto de entrada principal para la aplicación.
     * 
     * @param args Los argumentos de la línea de comandos (no utilizados en este caso).
     */

     public static void main(String[] args) {
        Poligono poligono;  
        Triangulo triangulo = new Triangulo();
        Cuadrilatero cuadrilatero = new Cuadrilatero ();
        // Imprime las representaciones de cadena de los objetos triangulo y cuadrilatero.
        
        //System.out.println(poligono);
        System.out.println(triangulo);
        System.out.println(cuadrilatero); 
        
        // Establece la base y la altura del triángulo y el cuadrilátero.
        triangulo.setBase(5);
        triangulo.setAltura(3);
        
        cuadrilatero.setBase(4);
        cuadrilatero.setAltura(6);
        
        // Imprime las representaciones de cadena actualizadas de los objetos triangulo y cuadrilatero.
        System.out.println(triangulo);
        System.out.println(cuadrilatero);
        // Calcula y muestra el área del triángulo y el cuadrilátero.
        System.out.println("El area del trinagulo es:" + triangulo.area());
        System.out.println("El area del cuadrilatero es: " + cuadrilatero.area());
        
        // Ejemplo de polimorfismo: un objeto de tipo Poligono puede referenciar un Triangulo.
        poligono = new Triangulo();
        System.out.println(poligono);
        
        // Comentado para evitar errores de compilación ya que Poligono no tiene el método getBase.
        //System.out.println(poligono.getBase()); 
        
        // Llama al método getPoligono con diferentes tipos de polígonos.
        
        getPoligono(poligono); 
        poligono = new Cuadrilatero(); 
        getPoligono(poligono); 
        
        // Ejemplo de una clase adicional (Flauta) y su método tipoInstrumento.
        Flauta flauta = new Flauta();
        System.out.println (flauta.tipoInstrumento());
        
        // Imprime el valor de PI y el nombre del primer mes utilizando la clase enum Meses.
        System.out.println(Math.PI);
        System.out.println(Meses.NOMBRE_MESES[Meses.UNO]); //terminar
        
    }    
    /**
     * Imprime el tipo de polígono pasado como argumento.
     * 
     * @param poligono El polígono del cual se imprime el tipo.
     */

    private static void getPoligono(Poligono poligono) { 
        if (poligono instanceof Triangulo){
            System.out.println("Es un triangulo ");
        
        }
        
        else if(poligono instanceof Cuadrilatero ){
            System.out.println("Es un cuadrilatero ");
        
        }
        
        else {
            System.out.println("Es un poligono ");
        
        }
            
    }      
}