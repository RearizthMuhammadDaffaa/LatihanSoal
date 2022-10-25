/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Matematika {
    void pertambahan(int a,int b){
        int sum = a + b;
        System.out.println("Hasil = " +sum);
    }
    void pengurangan(int a, int b){
     int min = a - b;
        System.out.println("Hasil = " +min);
    }
    void perkalian(int a, int b){
      int multiple = a*b;
        System.out.println("Hasil = "+multiple);
    }
    void pembagian(double a,double b){
        double divide = a /b;
        System.out.println("Hasil = "+divide);
    }
    void pertambahan(double a,double b,double c){
       double sum = a + b + c;
        System.out.println("Hasil = " +sum);
    }
    void pertambahan(double a,double b){
       double sum = a + b;
        System.out.println("Hasil = " +sum);
    }
    void pengurangan(double a, double b,double c){
     double min = a - b;
        System.out.println("Hasil = " +min);
    }
     void perkalian(double a, double b ,double c){
      double multiple = a*b;
        System.out.println("Hasil = "+multiple);
    }
     void pembagian(double a,double b , double c){
        double divide = a /b;
        System.out.println("Hasil = "+divide);
    }
}

class matematikaCanggih extends Matematika{
   void pertambahan(double a, double c, double b){
     double sum = a + b +c;
       System.out.println("Hasil = "+sum);
   }
}
