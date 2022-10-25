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
    public static void main(String[] args) {
        Matematika matematika1 = new Matematika();
        matematika1.pertambahan(20,20);
        matematika1.pengurangan(10,5);
        matematika1.perkalian(10,20);
        matematika1.pembagian(21,2);
        
        System.out.println("overloading");
        System.out.println("-----------------------");
        matematika1.pertambahan(12.5, 28.7, 14.2);
        matematika1.pertambahan(23,34);
        matematika1.pertambahan(12,28,14);
        matematika1.pertambahan(3.4,4.9);
        System.out.println("------------------------");
        
       matematikaCanggih matematika2 = new matematikaCanggih();
       matematika2.pertambahan(12.4, 13.3, 14.5);
    }
}
