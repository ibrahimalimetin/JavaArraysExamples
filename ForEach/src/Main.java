/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrahim Ali Metin
 */
public class Main {
    
    public static void main(String[] args) {
        
        String[] dizi = {"Ahmet","Mehmet","Selim","Osman"};
        
       /* for (int i = 0; i<dizi.length; i++){
            System.out.println(dizi[i]);
        }*/
       
       for (String x : dizi){
        //   System.out.println(x);
       }
       
           
       int[] dizi2 = {1,5,7,9,11,13};
       
       for (int y : dizi2){
          // System.out.println(y);
       }
       
        Test[] dizi3 = {new Test("Masa"), new Test("Sandalye"), new Test("Kalem"), new Test("Silgi")};
       
       for (Test z : dizi3){
           z.yazdir();
        }
    }
}
