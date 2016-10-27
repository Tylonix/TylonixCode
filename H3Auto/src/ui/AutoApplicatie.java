/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import domein.Auto;
import java.util.Scanner;

/**
 *
 * @author Matthias
 */
public class AutoApplicatie {

    public static void main(String args[])
    {
        Auto nieuweAuto = new Auto();
        Scanner input = new Scanner(System.in);
        double prijs;
        int km;
        System.out.println("Geef het verbruik per 100km in: ");
        nieuweAuto.setGemiddeldVerbruik(input.nextDouble());
        System.out.println("Geef de prijs voor 1l benzine in: ");
        prijs = input.nextDouble();
        System.out.println("Aantal kilometers: ");
        km = input.nextInt();
        
    }
}
