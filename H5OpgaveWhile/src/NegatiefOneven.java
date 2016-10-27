
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
public class NegatiefOneven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      int getal= 0;
       do
        {            
            System.out.println("Geef een getal in");
            getal = input.nextInt();
        } while (!(getal <=0 && getal % 2 !=0));
    }
    
}
