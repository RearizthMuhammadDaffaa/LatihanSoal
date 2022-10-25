/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class BankBeraksi {
    public static void main(String[] args) {
        Bank mySaldo = new Bank(100000);
        mySaldo.getSaldo();
        mySaldo.simpanUang(500000);
        mySaldo.ambilUang(150000);
    }
    
}
