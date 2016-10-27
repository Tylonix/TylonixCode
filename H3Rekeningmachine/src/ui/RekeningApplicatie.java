/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import domein.Rekenmachine;
import java.util.Scanner;

/**
 *
 * @author Matthias
 */
public class RekeningApplicatie {

    public static void main(String[] args)
    {
        Rekenmachine rek = new Rekenmachine();
        Scanner input = new Scanner(System.in);
        byte keuze;
        double getal;
        do
        {

            System.out.printf("Wat wil je doen: %n1 Optellen %n2 Aftrekken %n3 Vermenigvuldig %n4 Delen %n5 Clear%n");
            keuze = input.nextByte();
            if (keuze != 6)
            {

                System.out.println("Met welk getal?");
                getal = input.nextDouble();
                switch (keuze)
                {
                    case 1:
                        rek.telOp(getal);
                        break;
                    case 2:
                        rek.trekAf(getal);
                        break;
                    case 3:
                        rek.vermenigvuldig(getal);
                        break;
                    case 4:
                        rek.deelDoor(getal);
                        break;
                    case 5:
                        rek.clear();
                        break;
                }
            } else
            {           
                System.out.println(rek.getResultaat());
            }
            getal = 0;
            keuze = 0;
        } while (keuze != 5);

    }
}
