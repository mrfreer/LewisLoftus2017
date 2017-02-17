/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lewisloftus.chapter4;

import java.util.Random;

/**
 *
 * @author dfreer
 */
public class Coin {
    public enum face{Heads, Tails};
    int x;
    public Coin(){
       Random r = new Random(System.nanoTime());  //You need nanoTime for more accurate flipping!
       x = r.nextInt(2);
    }
    
    public String flip(){

        System.out.println(x);
        if(x == 0)
            return "Heads";
        else 
            return "Tails";
    }
}
