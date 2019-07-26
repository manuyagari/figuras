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
import java.util.Scanner;



    public class triangulo extends Figuras{
        
        private float L1;
        private float L2;
        triangulo (){super();}
        public void setL1(float L1){
        this.L1=L1;
        }
        public void setL2(float L2){
        this.L2=L2;
          }
        public float getL1(){
        return this.L1;
          }
        public float getL2(){
        return this.L2;
        }
    float area (){
    return getaltura()*getbase()/2;
    }
    float perimetro(){
    return getbase();
    
    }

    private int getaltura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getbase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
}
