/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop08;

/**
 *Clase que representa un triángulo, que hereda de la clase Poligono.
 * 
 * @author lilian
 */
public class Triangulo extends Poligono {
    // Ángulos del triángulo
    private int alfa, beta, gama;
    // Longitudes de los lados y Dimensiones del triángulo (base y altura)
    private float a, b, c, base, altura;
    
    /**
    * Constructor por defecto de la clase Triangulo.
    */

    public Triangulo() {
    }
    /**
     * Constructor parametrizado de la clase Triangulo.
     * 
     * @param alfa   Ángulo alfa del triángulo.
     * @param beta   Ángulo beta del triángulo.
     * @param gama   Ángulo gama del triángulo.
     * @param a      Longitud del lado a del triángulo.
     * @param b      Longitud del lado b del triángulo.
     * @param c      Longitud del lado c del triángulo.
     * @param base   Base del triángulo.
     * @param altura Altura del triángulo.
     */
    public Triangulo(int alfa, int beta, int gama, float a, float b, float c, float base, float altura) {
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
    * Obtiene el valor del ángulo beta.
    * 
    * @return El valor del ángulo beta.
    */
    
    public int getBeta() {
        return beta;
    }
    /**
    * Establece el valor del ángulo beta.
    * 
    * @param beta Nuevo valor del ángulo beta.
    */

    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
    * Obtiene el valor del ángulo gama.
    * 
    * @return El valor del ángulo gama.
    */

    public int getGama() {
        return gama;
    }
    /**
    * Establece el valor del ángulo gama.
    * 
    * @param gama Nuevo valor del ángulo gama.
    */

    public void setGama(int gama) {
        this.gama = gama;
    }
    /**
    * Obtiene la longitud del lado a.
    * 
    * @return La longitud del lado a.
    */

    public float getA() {
        return a;
    }
    
    /**
     * Establece la longitud del lado a.
     * 
     * @param a Nueva longitud del lado a.
     */

    public void setA(float a) {
        this.a = a;
    }
    // Métodos similares para los demás atributos...

    /**
     * Obtiene el valor de la base del triángulo.
     * 
     * @return El valor de la base del triángulo.
     */

    public float getB() {
        return b;
    }
    /**
    * Establece el valor del lado B del triángulo.
    *
    * @param b Nuevo valor del lado B del triángulo.
    */

    public void setB(float b) {
        this.b = b;
    }
    /**
    * Obtiene el valor del lado C del triángulo.
    *
    * @return El valor del lado C del triángulo.
    */

    public float getC() {
        return c;
    }
    /**
    * Establece el valor del lado C del triángulo.
    *
    * @param c Nuevo valor del lado C del triángulo.
    */

    public void setC(float c) {
        this.c = c;
    }
    /**
    * Obtiene el valor de la base del triángulo.
    *
    * @return El valor de la base del triángulo.
    */

    public float getBase() {
        return base;
    }
    /**
    * Establece el valor de la base del triángulo.
    * 
    * @param base Nueva base del triángulo.
    */

    public void setBase(float base) {
        this.base = base;
    }
    /**
    * Obtiene el valor de la altura del triángulo.
    * 
    * @return El valor de la altura del triángulo.
    */

    public float getAltura() {
        return altura;
    }
    /**
    * Establece el valor de la altura del triángulo.
    * 
    * @param altura Nueva altura del triángulo.
    */

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
     // Métodos similares para los demás atributos...

    /**
     * Calcula y devuelve el área del triángulo.
     * 
     * @return El área del triángulo.
     */
    @Override
    public int area(){
        return (int)(base * altura/2); 
    }
     /**
     * Calcula y devuelve el perímetro del triángulo.
     * 
     * @return El perímetro del triángulo.
     */

    @Override
    public int perimetro (){
        return (int)(a+b+c);
    
    }
     /**
     * Devuelve una representación en cadena del objeto Triangulo.
     * 
     * @return Representación en cadena del objeto Triangulo.
     */
    @Override
    public String toString() {
        return super.toString() + ": " +"Triangulo {" + "alfa=" + alfa + ", beta=" + beta + ", gama=" + gama + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    
    }   
}

