/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank;

/**
 *
 * @author hp
 */
public class BankBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bankk a = new Bankk();
        
        System.out.println("Selamat datang di bank ABC");
        a.getsaldo();
        a.simpanUang(150000);
        a.ambilUang(500000);

}
}
