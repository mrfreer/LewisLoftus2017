/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lewisloftus.chapter4;

/**
 *
 * @author dfreer
 */
public class CoinFlips {
    public static void main(String[] args) {
       
        int counterHeads = 0;
        final int NUM_FLIPS = 100000;
        for(int i = 0; i < NUM_FLIPS; i++){
            Coin c = new Coin();
            if(c.flip().equals("Heads"))
                counterHeads++;
        }
        System.out.println("Heads was flipped " + counterHeads);
        System.out.println("Tails was flipped " + (NUM_FLIPS - counterHeads));
    }
}
