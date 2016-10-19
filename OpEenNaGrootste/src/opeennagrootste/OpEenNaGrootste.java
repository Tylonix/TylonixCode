/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opeennagrootste;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Matthias
 */
public class OpEenNaGrootste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] getalArray = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
        {
           System.out.println("Geef getam " + (i + 1) + " in");
           getalArray[i] = input.nextInt();
        }
         Arrays.sort(getalArray);
         System.out.println(getalArray[8]);
    }  
}
