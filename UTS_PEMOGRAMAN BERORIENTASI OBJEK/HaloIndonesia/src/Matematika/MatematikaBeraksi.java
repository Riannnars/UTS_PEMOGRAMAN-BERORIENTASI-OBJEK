package Matematika;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MatematikaCanggih mtc = new MatematikaCanggih();
        mtc.pertambahan(20, 20);
        mtc.pengurangan(10, 5);
        mtc.perkalian(10, 20);
        mtc.pembagian(21, 2);
        
        System.out.println("---------------");
        
        mtc.pertambahan(12.5, 28.7, 14.2 );
        mtc.pengurangan(23, 34);
        mtc.perkalian(12, 28, 14);
        mtc.pembagian(3.4, 4.9);
        
    }
    
}
