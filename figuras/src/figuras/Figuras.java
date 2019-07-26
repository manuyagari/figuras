/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Usuario
 */
public class Figuras {

    
  
abstract public class figuras {
    
    private float base;
    private float  altura;
 private float area,perimetro;
    //vacio
    figuras(){}
    //parametros
    figuras(float base,float altura){
    this.base=base;
    this.altura=altura;
    
    
    
    }
    public void setbase(float base){
        this.base=base;
    }
    public float getbase(){
    return this.base;
    }
    
    public void setaltura(float altura){
    this.altura=altura;
    }

    public float getaltura(){
        return this.altura;
    }
    abstract float area();
    abstract float perimetro();
}

    }
    

