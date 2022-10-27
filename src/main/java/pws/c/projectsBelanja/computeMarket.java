/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pws.c.projectsBelanja;

/**
 *
 * @author Abian
 */
public class computeMarket {
//    perhitungan harga barang * jumlah item
    public double getTotal(double harga, double item){
        double total = harga * item;
        
        return total;
    }
    
//    Diskon
    public double getDiskon(double harga, double item){
        double total = harga * item;
        double diskon;
        
        // Potongan 0 %
        if(total < 10000){
            diskon = total - (total * 0);
        }
        // Diskon 5 %
        else if((total > 10000) || (total < 50000)){
            diskon = total - (total * 5/100);
        }
        // Diskon 10 %
        else if( (total > 50000) || (total < 100000)){
            diskon = total - (total * 10/100);
        }
        // Diskon 15 %
        else{
            diskon = total - (total * 15/100);
        }
        
        return diskon;
    }

//  Keterangan Diskon
    public double ketDiskon(double harga, double item){
        double total = harga * item;
        double diskon;
        
        // Potongan 0 %
        if(total < 10000){
            diskon = 0;
        }
        // Diskon 5 %
        else if((total > 10000) || (total < 50000)){
            diskon = 5;
        }
        // Diskon 10 %
        else if( (total > 50000) || (total < 100000)){
            diskon = 10;
        }
        // Diskon 15 %
        else{
            diskon = 15;
        }
        
        return diskon;
    }
}
