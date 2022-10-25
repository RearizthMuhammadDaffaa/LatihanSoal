/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Bank {
    int Mysaldo;
    int total;
     public Bank(int saldo){
         Mysaldo = saldo;
    }
     void getSaldo(){
      
       System.out.println("Selamat Datang di Bank ABC");
       System.out.println("Saldo saat ini: "+Mysaldo);
         System.out.println("--------------------------");
     }
     void simpanUang(int Simpan){
           total = Simpan + Mysaldo;
       
         System.out.println("Simpan Uang: "+Simpan);
         System.out.println("Saldo saat ini: "+"Rp." + total);
         System.out.println("--------------------------");
     }
     void ambilUang(int ambil){
        int totalSaldo = total - ambil;
 
         System.out.println("Ambil uang: "+ambil);
         System.out.println("Saldo saat ini: "+"Rp."+totalSaldo);
         System.out.println("--------------------------");
         
     }
}
