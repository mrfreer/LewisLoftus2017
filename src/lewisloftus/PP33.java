/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lewisloftus;

import java.util.Random;

/**
 *
 * @author dfreer
 */
public class PP33 {

    public static void main(String[] args) {
        Random r = new Random(System.currentTimeMillis());
        int zip = r.nextInt(7);
        int zip1 = r.nextInt(7);
        int zip2 = r.nextInt(7);
        String zipCode = "" + zip + "" + zip1 + "" + zip2;
        int nextThree = r.nextInt(999);
        int lastFour = r.nextInt(9999);
        System.out.print(zipCode + "-");
        if(nextThree < 10)
            System.out.print("00" + nextThree+ "-");
        else if(nextThree < 100)
            System.out.print("0" + nextThree+ "-");
        else
            System.out.print(nextThree+ "-");
        if(lastFour < 10){
            System.out.print("000" + lastFour);
        }
        else if(lastFour < 100)
            System.out.print("00" + lastFour);
        else if(lastFour < 1000)
            System.out.print("0" + lastFour);
        else
            System.out.print(lastFour);

    }
}
