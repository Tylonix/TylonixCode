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
public class Rekening {
    //Attributes
    private long rekeningnummer;
    private double saldo;
    private String houder;
    
    
    //Constructors
    public Rekening(){
        
    }    
    public Rekening(long rekeningnummer){
        this.rekeningnummer = rekeningnummer;
        
    }
    public Rekening(long rekeningnummer, double saldo){
          this.rekeningnummer = rekeningnummer;
          this.saldo = saldo;
    }
    
    public Rekening(long rekeningnummer, double saldo, String houder){
         this.rekeningnummer = rekeningnummer;
          this.saldo = saldo;
          this.houder = houder;
    }
    
    //Methods
    //Get
    public long getRekeningnummer(){
        return this.rekeningnummer;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public String getHouder(){
        return this.houder;
    }
    
    //Set
    public void setRekeningnummer(long rekeningnummer){
        this.rekeningnummer = rekeningnummer;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
       
    }
    public void setHouder(String houder){
        this.houder = houder;
    }
}
