/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangkajava;

/**
 *
 * @author niputunk
 */

public class Tebakangkajava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hai.. nama saya Puput, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silahkan tebak ya!");
        System.out.println("Score awal = 100 ");
        System.out.println("Score akhir = 0 ");
        
        Tebak T1 = new Tebak();
        T1.random();
        T1.bonus();
        T1.score();
        T1.totalTebakan();                
    }
}
