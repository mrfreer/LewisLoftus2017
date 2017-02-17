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
        int zip = r.nextInt(599) + 100;
        int nextThree = r.nextInt(899) + 100;
        int lastFour = r.nextInt(8999) + 1000;
        System.out.println(zip + "-" + nextThree + "-" + lastFour);
    }
}
