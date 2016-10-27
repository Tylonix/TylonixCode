/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.util.Scanner;
import domein.Tombola;
/**
 *
 * @author Matthias
 */
public class TombolaApplicatie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int loten;
        String naam;
        double prijs;
      
        System.out.print("Geef de naam in");
        naam = input.nextLine();
        System.out.print("Geef het aantal loten in: ");
        loten = input.nextInt();
                System.out.print("Prijs per lot: ");
        prijs = input.nextInt();
        Tombola verkoop = new Tombola(naam, loten, prijs);
        System.out.printf("1 %.2f, 5 %.2f, 10 %.2f", verkoop.getPrijsPerLot(), verkoop.geefPrijsVanaf5Lotjes(), verkoop.geefPrijsVanaf10Lotjes());
        do
        {
            
        } while (verkoop.getAantalLotjes() > 0);
        
        
    }
    
}
