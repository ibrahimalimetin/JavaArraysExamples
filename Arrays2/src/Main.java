
import java.util.Arrays;
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
    public static int [] diziyi_doldur(int sayi){
        Scanner scanner = new Scanner(System.in);
        int[] cikti = new int[sayi];
        for(int i = 0 ; i<sayi ; i++){
            System.out.println("Dizinin " + (i+1) + " 'inci elemanını giriniz?");
            cikti[i] = scanner.nextInt();
            
        }
        return cikti;
    }
    public static void diziyi_yaz(int[] dizi){
        for(int i = 0 ; i < dizi.length; i++){
            System.out.println("Element " + (i+1) + ": " + dizi[i]);
        }
    }
    public static void dizi_sort(int [] dizi){
        
        //Arrays sınıfı
        Arrays.sort(dizi); //Kendi içinde sıralama işlemini gerçekleştirecek.
        //Arrays sınıfı içerisinde arrayler ile ilgili işlermleri gerçekleştirebiliriz. 
        
        diziyi_yaz(dizi);
    }
    
    public static void main(String[] args) {
        //int[] a = diziyi_doldur(5);
        //diziyi_yaz(a);
        //dizi_sort(a);
        
        int[]a1 = {1,2,3,4,5,6};
        int[]a2 = {1,2,3,4,5,6};
        
        //if (a1 == a2){//İçerisindeki değerler aynı olsa bile iki dizide farklı yerleri gösterdiğinden eşit değillerdir.
          if (Arrays.equals(a1, a2)){//Arrays sınıfı içeriside equals methodunu kullanarak içeriklerini karşılaştırailiriz.  
            System.out.println("Diziler Eşittir");
        }
        else{
            System.out.println("Diziler Eşit Değil"); 
            
        }
    }
    
}
