/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

/**
 *
 * @author Matthias
 */
public class Rekenmachine {
    private double resultaat;
    
    //Constructor
    
    //Methods
    
    public double getResultaat(){
        return this.resultaat;
    }
    public void setResultaat(double resultaat){
        this.resultaat = resultaat;
    }
    
    public void telOp(double getal){
        this.resultaat += getal;
    }
    public void trekAf(double getal){
        this.resultaat -= getal;
    }
    public void vermenigvuldig(double getal){
        this.resultaat *= getal;
    }
    public void deelDoor(double getal){
        this.resultaat /= getal;
    }
    public void clear(){
        this.resultaat = 0.0;
    }
}
    