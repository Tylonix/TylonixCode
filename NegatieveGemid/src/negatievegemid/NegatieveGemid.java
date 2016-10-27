/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negatievegemid;

import java.util.Scanner;

/**
 *
 * @author Matthias
 */
public class NegatieveGemid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        Double gemid = 0.0;
        byte teller = 0;
        double getal = 0;
        System.out.print("Geef een getal in, -1 om ate stoppen ");
        getal = input.nextDouble();
        if (getal < 0)
        {
            teller += 1;
            gemid += getal;
        }

        while (getal != -1)
        {
            System.out.print("Geef een getal in, -1 om te stoppen ");
            getal = input.nextDouble();
            if (getal < 0 && getal != -1)
            {
                teller += 1;
                gemid += getal;
            }
        }
       
        if (teller == 0)
        {
            System.out.println("Er zijn geen getallen ingegeven");
        } else
        {
            System.out.printf("Het gemiddelde van %d aantal getallen is %.3f", teller, gemid / teller);
        }
    }

}
