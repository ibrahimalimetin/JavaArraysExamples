
import java.util.Scanner;

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
    
    public static void diziyi_bastir(int[] array){// int array referansı gönderecez ve bunun üzerinde işlemler yapılacak demektir. 
        
        for (int i = 0 ; i<array.length ; i++){
            System.out.println("Element " + (i+1) + ": " + array[i]);
        }
        
    }
    
    public static double ortalamaHesapla (int[] dizi){
        
        int toplam =0;
       
        for(int i =0; i<dizi.length; i++){
            toplam += dizi[i];
        }
        
        return ((double)toplam /dizi.length);
    }
    
    public static void main(String[] args) {
        
        int[]a = new int[3]; //Bellekte 3 int depolayacak kadar yer açılıyor. 
       /* 
        a[0] = 1;
        a[1] = 3;
        a[2] = 5;
        
        System.out.println(a[0]);*/
       
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<3 ; i++) {
        a[i] = scanner.nextInt(); //kullanıcıdan dizimizin elemanlarını istiyoruz. 
    }
        //System.out.println(a[2]);
        //System.out.println("Dizimizin uzunluğu : " + a.length); // Dizimizin uzunluğunu göstermektedir. 
        //diziyi_bastir(a);
        System.out.println("Dizi elemanları ortalaması " + ortalamaHesapla(a));
    }
    
}
