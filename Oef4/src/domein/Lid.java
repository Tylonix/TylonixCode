/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Matthias
 */
public class Lid {

    private String naam;
    private int startjaar;
    private int categorie;
    private int aantalFamilieleden;

    private int HUIDIG_JAAR = GregorianCalendar.getInstance().get(Calendar.YEAR);

    public Lid(String n)
    {
        this.naam = n;
      
    }

    public Lid(String naam, int startjaar, int categorie, int aantalFamilieleden)
    {
        this.naam = naam;
        if (startjaar <= HUIDIG_JAAR && startjaar >= 1980)
        {

            this.startjaar = startjaar;
        } else
        {
            this.startjaar = HUIDIG_JAAR;
        }
        if (categorie <= 1 && categorie >= 3)
        {
            this.categorie = categorie;
        } else
        {
            this.categorie = 1;
        }
       if(aantalFamilieleden >= 0)
        {
        this.aantalFamilieleden = aantalFamilieleden;
        }
        else
        {
            this.aantalFamilieleden = 0;
        }
    }

    public int berekenAantalJaar()
    {
        return HUIDIG_JAAR - startjaar;
    }

    public double berekenLidgeld()
    {
        double lidgeld = 22;
      switch (categorie)
        {
            case 2:
                lidgeld *= 0.8;
                break;
            case 3:
                lidgeld = 40;
                break;
        }
        if (HUIDIG_JAAR - this.startjaar >= 10)
        {
            lidgeld *= 0.9;
        }
        switch(aantalFamilieleden){
            
            case 0:
                break;
                case 1: 
                    lidgeld *= 0.95;
                    break;                             
                default:
                    lidgeld *= 0.9;
                    break;
        }
        
        return lidgeld;
    }

    public String getNaam()
    {
        return naam;
    }

    public int getStartjaar()
    {
        return startjaar;
    }

    public int getCategorie()
    {
        return categorie;
    }

    public int getAantalFamilieleden()
    {
        return aantalFamilieleden;
    }

    public void setNaam(String naam)
    {
        this.naam = naam;
    }

    public void setStartjaar(int startjaar)
    {
         if (startjaar <= HUIDIG_JAAR && startjaar >= 1980)
        {

            this.startjaar = startjaar;
        } else
        {
            this.startjaar = HUIDIG_JAAR;
        }
    }

    public void setCategorie(int categorie)
    {
            if (categorie >= 1 && categorie <= 3)
        {
            this.categorie = categorie;
        } else
        {
            this.categorie = 1;
        }
    }

    public void setAantalFamilieleden(int aantalFamilieleden)
    {
        if(aantalFamilieleden >= 0)
        {
        this.aantalFamilieleden = aantalFamilieleden;
        }
        else
        {
            this.aantalFamilieleden = 0;
        }
    }
    
}
