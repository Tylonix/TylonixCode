/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Matthias
 */
package grootstekleinste;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GrootsteKleinste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        byte teller=0;
    double getal=0;
        List getallen = new ArrayList();
        NumberFormat formatter = new DecimalFormat("#0.00"); 
        Scanner input = new Scanner(System.in);
        System.out.println("Geef een getal in");
        getal = input.nextDouble();
        if (getal == 0)
        {
               System.out.println("Niet direct 0 ingeven");
        } else
        {
             getallen.add(getal) ;
            while (getal!= 0)
            { System.out.println("Geef een getal in");
                 getal = input.nextDouble();
                getallen.add(getal) ;
                teller++;
            }
        }
        if (teller != 0)
        {
             Collections.sort(getallen);
      System.out.printf("Het laagste getal is %f en het hoogste getal is %f", getallen.get(1), getallen.get(teller));
        }
     
    }

}
