/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Handphone handphone_1 = new Handphone();
        handphone_1.Hidupkan();
        
        handphone_1.kirimSMS();
        handphone_1.matikan();
    }
    
}
