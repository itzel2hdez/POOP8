/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop08;

/**
 *Clase que representa un cuadrilátero, que hereda de la clase Poligono.
 * 
 * @author lilian
 */
public class Cuadrilatero extends Poligono {
    // Ángulos del cuadrilátero
    private int alfa, beta, gama;
    // Lados del cuadrilátero y Dimensiones del cuadrilátero (base y altura)
    private int a, b, c, base, altura;
    
     /**
     * Constructor por defecto de la clase Cuadrilatero.
     */

    public Cuadrilatero() {
    }

    /**
     * Constructor parametrizado de la clase Cuadrilatero.
     * 
     * @param alfa   Ángulo alfa del cuadrilátero.
     * @param beta   Ángulo beta del cuadrilátero.
     * @param gama   Ángulo gama del cuadrilátero.
     * @param a      Lado a del cuadrilátero.
     * @param b      Lado b del cuadrilátero.
     * @param c      Lado c del cuadrilátero.
     * @param base   Base del cuadrilátero.
     * @param altura Altura del cuadrilátero.
     */
    public Cuadrilatero(int alfa, int beta, int gama, int a, int b, int c, int base, int altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.gama = gama;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }
    // Métodos de acceso para los atributos

    /**
     * Obtiene el valor del ángulo alfa.
     * 
     * @return El valor del ángulo alfa.
     */

    public int getAlfa() {
        return alfa;
    }
    /**
     * Establece el valor del ángulo alfa.
     * 
     * @param alfa Nuevo valor del ángulo alfa.
     */

    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }
    /**
    * Obtiene el valor del ángulo beta del triángulo.
    *
    * @return El valor del ángulo beta.
    */

    public int getBeta() {
        return beta;
    }
    /**
    * Establece el valor del ángulo beta del triángulo.
    *
    * @param beta Nuevo valor del ángulo beta.
    */

    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
    * Obtiene el valor del ángulo gama del triángulo.
    *
    * @return El valor del ángulo gama.
    */

    public int getGama() {
        return gama;
    }

    /**
    * Establece el valor del ángulo gama del triángulo.
    *
    * @param gama Nuevo valor del ángulo gama.
    */
    public void setGama(int gama) {
        this.gama = gama;
    }
    /**
    * Obtiene la longitud del lado a del triángulo.
    *
    * @return La longitud del lado a.
    */

    public int getA() {
        return a;
    }
    /**
    * Establece la longitud del lado a del triángulo.
    *
    * @param a Nueva longitud del lado a.
    */

    public void setA(int a) {
        this.a = a;
    }
    /**
    * Obtiene la longitud del lado b del triángulo.
    *
    * @return La longitud del lado b.
    */

    public int getB() {
        return b;
    }
    /**
    * Establece la longitud del lado b del triángulo.
    *
    * @param b Nueva longitud del lado b.
    */

    public void setB(int b) {
        this.b = b;
    }
    /**
    * Obtiene la longitud del lado c del triángulo.
    *
    * @return La longitud del lado c.
    */

    public int getC() {
        return c;
    }
    /**
    * Establece la longitud del lado c del triángulo.
    *
    * @param c Nueva longitud del lado c.
    */

    public void setC(int c) {
        this.c = c;
    }
    /**
    * Obtiene la base del triángulo.
    *
    * @return La base del triángulo.
    */

    public int getBase() {
        return base;
    }
    /**
    * Establece la base del triángulo.
    *
    * @param base Nueva base del triángulo.
    */

    public void setBase(int base) {
        this.base = base;
    }
    /**
    * Obtiene la altura del triángulo.
    *
    * @return La altura del triángulo.
    */

    public int getAltura() {
        return altura;
    }
    /**
    * Establece la altura del triángulo.
    *
    * @param altura Nueva altura del triángulo.
    */

    public void setAltura(int altura) {
        this.altura = altura;
    }

    // Métodos similares para los demás atributos...

    /**
     * Calcula y devuelve el área del cuadrilátero.
     * 
     * @return El área del cuadrilátero.
     */
    
    @Override
    public int area(){
        return (int)(base * altura); 
    }
    /**
     * Calcula y devuelve el perímetro del cuadrilátero.
     * 
     * @return El perímetro del cuadrilátero.
     */

    @Override
    public int perimetro (){
        return (int)(2*a+2*b);
    
    }
    /**
     * Devuelve una representación en cadena del objeto Cuadrilatero.
     * 
     * @return Representación en cadena del objeto Cuadrilatero.
     */

    @Override
    public String toString() {
        return super.toString() +": "+ "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", gama=" + gama + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }

    
}
