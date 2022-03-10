/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos_daw_ljcm;

/**
 *
 * @author Lorenzo Jose Castillo Monteagudo
 * @version 11/02/2018/A
 */
public class miniCalculadoraEjemplo {
//Campos de la clase
    
    /*
    *Constructor vacio que permite la utilizacion de sus metodos una vez creado el objeto
    */
    public miniCalculadoraEjemplo() {
    }//Cierre del constructor
    
    
   
    public double valorAbsolute(double a)
    {
        double num=Math.abs(a);
        return num;
    
    }
    
     /*
    * Metodo que recibe un parametro double y devuelve un tipo double con su valor absoluto
    * @param a El parámetro a define el número de tipo double del cual vamos a sacar su valor absoluto
    * @return num es el número absoluto del numero recibido, de tipo double
    */
    
    public double raizCuadrada(double b)
    {
    double num2=Math.sqrt(b);
        return num2;
    }
    
     /*
    * Metodo que recibe un parametro double y devuelve un tipo double con su raiz cuadrada
    * @param b El parámetro a define el número de tipo double del cual vamos a sacar su valor absoluto
    * @return num2 es la raiz cuadrada del numero recibido, de tipo double
    */
}
