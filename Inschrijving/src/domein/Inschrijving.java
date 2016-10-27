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
public class Inschrijving {

    private String naam;
    private char categorie;
    private int aantalbroodjes;

    public Inschrijving(String naam, char categorie)
    {

        this.naam = naam;
        switch (categorie)
        {
            case 'w':
                this.categorie = categorie;
                break;
            case 'p': 
                 this.categorie = categorie;
                break;
            case 'g':
                 this.categorie = categorie;
                break;
                default:
                    this.categorie = 'g';
        }
    
    }

    public char getCategorie()
    {
        return categorie;
    }

    public void setCategorie(char categorie)
    {
         switch (categorie)
        {
            case 'w':
                this.categorie = categorie;
                break;
            case 'p': 
                 this.categorie = categorie;
                break;
            case 'g':
                 this.categorie = categorie;
                break;
                default:
                    this.categorie = 'g';
        }
    
    }

    public String getNaam()
    {
        return naam;
    }

    public void setNaam(String naam)
    {
        this.naam = naam;
    }

    public void setAantalBroodjes(int aantalbroodjes)
    {
        if (aantalbroodjes > 0 && aantalbroodjes <= geefAantalPersonen()*5)
        {
             this.aantalbroodjes = aantalbroodjes;
        }
        else {
             this.aantalbroodjes = geefAantalPersonen()*2;
        }
       
    }

    public int getAantalBroodjes()
    {
        return aantalbroodjes;
    }
    
    public int geefAantalPersonen(){
        switch(getCategorie()) {
            case 'w': case 'g':
                return 1;
            case 'p':
                return 2;
            default:
                return 1;
        }
    }

}
