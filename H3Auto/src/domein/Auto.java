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
public class Auto {
    private String kleur;
    private String merk;
    private String type;
    private String nrplaat;
    private String chassisnummer;
    private double gemiddeldVerbruik;

    public Auto()
    {
    }
    
   
    public Auto(String kleur) {
        this.kleur = kleur;
    }
     public Auto(String kleur, String merk) {
        this.kleur = kleur;
        this.merk = merk;
    }

    public String getKleur()
    {
        return kleur;
    }

    public String getMerk()
    {
        return merk;
    }

    public String getType()
    {
        return type;
    }

    public String getNrplaat()
    {
        return nrplaat;
    }

    public String getChassisnummer()
    {
        return chassisnummer;
    }

    public double getGemiddeldVerbruik()
    {
        return gemiddeldVerbruik;
    }

    public void setKleur(String kleur)
    {
        this.kleur = kleur;
    }

    public void setMerk(String merk)
    {
        this.merk = merk;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setNrplaat(String nrplaat)
    {
        this.nrplaat = nrplaat;
    }

    public void setChassisnummer(String chassisnummer)
    {
        this.chassisnummer = chassisnummer;
    }

    public void setGemiddeldVerbruik(double gemiddeldVerbruik)
    {
        this.gemiddeldVerbruik = gemiddeldVerbruik;
    }
     public double berekenVerbruik(double km, double prijs) {
         return gemiddeldVerbruik / 100 * 
     }
     
}
