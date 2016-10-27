/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthias
 */
public class DeelbaarOptelling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int som = 0;
        for (int i = 12; i <= 500; i += 12)
        {
            som += i;
        }
        System.out.println("De som is :" + som);
    }

}
