/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BilanganPrima;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MainAppBilPrima {
    // Fungsi untuk pengecekan jenis bilangan bulat termasuk bilangan prima atau tidak
    public static boolean bilanganPrima(int bil) {
        if (bil < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(bil); i++) {
            if (bil % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Fungsi untuk mendapat hasil bilangan bulat tersebut bukan bilangan prima
    public static int getBilPrima(int bil) {
        for (int i = 2; i <= Math.sqrt(bil); i++) {
            if (bil % i == 0) {
                return i;
            }
        }
        // Jika angka tersebut adalah bilangan prima
        return bil; 
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input angka bilangan bulat: ");
        int bil = input.nextInt();
     
        if(bilanganPrima(bil)){
            System.out.println(bil + " adalah bilangan prima.");
        } else {
            System.out.println(bil + " bukan bilangan prima.");
        }
    }
}
