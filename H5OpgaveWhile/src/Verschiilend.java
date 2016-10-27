
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthias
 */
public class Verschiilend {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      int getal1, getal2;
        do
        {
            System.out.print("Geef een getal in verschillend van 1000 en niet deelbaar door 12");
            getal1 = input.nextInt();
        } while (!(getal1 != 1000 && getal1 % 12 != 0));
           do
        {
            System.out.print("Geef een getal groter dan getal 1");
            getal2 = input.nextInt();
        } while (getal2 <= getal1);
    }
    
}
