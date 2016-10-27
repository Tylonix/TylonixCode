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
public class Tombola {

    private String verenigingnaam;
    private int aantalLotjes;
    private double prijsPerLot;

    public Tombola(String naam, int aantal, double prijs)
    {
        this.verenigingnaam = naam;
        if (aantal < 0)
        {
            this.aantalLotjes = 0;
        } else
        {
            this.aantalLotjes = aantal;
        }

        if (prijs > 0)
        {
            this.prijsPerLot = prijs;
        } 
        else
        {
            this.prijsPerLot = 1;
        }
    }

    public String getVerenigingnaam()
    {
        return verenigingnaam;
    }

    public void setVerenigingnaam(String verenigingnaam)
    {
        this.verenigingnaam = verenigingnaam;
    }

    public int getAantalLotjes()
    {
        return aantalLotjes;
    }

    public void setAantalLotjes(int aantalLotjes)
    {
     /*   if (aantalLotjes < 0)
        {
            this.aantalLotjes = 0;
        } else
        {*/
            this.aantalLotjes = aantalLotjes;
       // }
    }

    public double getPrijsPerLot()
    {
        return prijsPerLot;
    }

    public void setPrijsPerLot(double prijsPerLot)
    {
        this.prijsPerLot = prijsPerLot;
    }

    public double geefPrijsVanaf5Lotjes()
    {
        return prijsPerLot *= 0.9;
    }

    public double geefPrijsVanaf10Lotjes()
    {
        return prijsPerLot *= 0.75;
    }

}
