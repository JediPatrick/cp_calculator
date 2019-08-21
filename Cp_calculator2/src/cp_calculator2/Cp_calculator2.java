/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp_calculator2;

import java.util.Scanner;

/**
 *
 * @author patrickbruus
 */
public class Cp_calculator2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double attack;
        double defense;
        double stamina;

        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the name of the pokemon: ");
//        String name = in.next();
//  

        String name = "medicham";
        String namelowcase = name.toLowerCase();
        double[] array = findpokemon.finding(namelowcase);
        attack = array[0];
        defense = array[1];
        stamina = array[2];
        double[][] array2d = findiv.calc_iv_comb(attack, defense, stamina);
        //        calc.calccp(attack, defense, stamina);

        calc.calccponeline(attack, defense, stamina, 9, 13, 9, array2d);
        calc.calccponeline(attack, defense, stamina, 1, 13, 10, array2d);
        calc.calccponeline(attack, defense, stamina, 1, 12, 11, array2d);
        calc.calccponeline(attack, defense, stamina, 2, 10, 12, array2d);
        calc.calccponeline(attack, defense, stamina, 14, 10, 11, array2d);
        calc.calccponeline(attack, defense, stamina, 3, 10, 15, array2d);
        calc.calccponeline(attack, defense, stamina, 8, 6, 13, array2d);
        calc.calccponeline(attack, defense, stamina, 5, 13, 14, array2d);
        calc.calccponeline(attack, defense, stamina, 2, 7, 7, array2d);
        calc.calccponeline(attack, defense, stamina, 2, 7, 13, array2d);


    }
    
}
