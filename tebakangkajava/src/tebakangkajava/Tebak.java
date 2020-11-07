/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangkajava;

import java.util.Random;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeMath.random;
/**
 *
 * @author niputunk
 */
class Tebak {
    /* atribut */
    int cari;
    int jawab;
    int bonus; 
    int jumlah;
    int totalScore;
    int totalTebakan;
    int scoreAwal=100;
    
    /* method */
    void random(){
        Random angka = new Random();
        this.cari = angka.nextInt(101);
}
    void score(){
        this.totalScore = this.scoreAwal + this.bonus;
        System.out.println("Total score : " + this.jumlah);
    }   
    void bonus(){
        if (this.totalTebakan <= 5){
            this.bonus += 50;
        }
        System.out.println("Bonus : " + this.bonus);
    }    
    void totalTebakan(){
        Scanner input = new Scanner (System.in);
        do {
            System.out.println("Tebakan anda : ");
            this.jawab = input.nextInt();
            this.totalTebakan += 1;
            if (jawab == cari ){
                System.out.println("Yeay... Bilangan tebakan anda benar" + this.bonus);
                System.out.println("Score : " + this.scoreAwal);
            }else   {
                if (this.scoreAwal > 0) {
                    this.scoreAwal -= 2;
                    if (jawab < cari) {
                        System.out.println("Bilangan tebakan anda terlalu kecil");
                    }else if (jawab < cari) {
                        System.out.println("Bilangan tebakan anda terlalu besar");
                }else {
                        this.jawab = input.nextInt();
                        this.totalTebakan += 1;
                if (jawab < cari);
                    System.out.println("Yeay... Bilangan tebakan anda benar :-)");
                    System.out.println("Score : " + this.scoreAwal);
                }else {
                    if (this.scoreAwal > 0) {
                        this.scoreAwal -= 2;
                        if (jawab < cari) {
                            System.out.println("Bilangan tebakan anda terlalu kecil");
                    }else if (jawab < cari) {
                            System.out.println("Bilangan tebakan anda terlalu besar");}
                        }                                            
                    }
                }
            }
        }
    } while jawab != cari;
}