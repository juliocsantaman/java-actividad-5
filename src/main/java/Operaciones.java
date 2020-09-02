/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julio
 */
public class Operaciones {
    // Atributos/propiedades.
    private float x, y;
    
    // Métodos.
    // Método constructor.
    public Operaciones(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    // Método suma.
    public float suma() {
        return x + y;
    }
    
    // Método resta.
    public float resta() {
        return x - y;
    }
    
    // Método multiplicación.
    public float multiplicacion() {
        return x * y;
    }
    
    // Método división.
    public float division() {
        return x / y;
    }
    
    // Método módulo.
    public float modulo() {
        return x % y;
    }
    
    // Métodos getters.
    public float getX() {
        return x;
    }
    
    public float getY() {
        return y;
    }
}
