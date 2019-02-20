
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
    
    public static void main(String[] args) {
        
        int[] dizi = {1,3,5,7,9,11}; //tek boyutlu dizilerdir. 
        int [][] dizi2= new int[3][3]; //Satır sayısı 3 , sütun sayısı 3 olacak şekilde çok boyutlu bir dizi oldu.
        int [][] dizi3 = {{11,22,33},{44,55,66},{77,88,99}};
        
        dizi2[0][0] = 11;
        dizi2[0][1] = 22;
        dizi2[0][2] = 33;
        dizi2[1][0] = 44;
        dizi2[1][1] = 55;
        dizi2[1][2] = 66;
        dizi2[2][0] = 77;
        dizi2[2][1] = 88;
        dizi2[2][2] = 99;
        
        //System.out.println(dizi3[2][2]);
        
        int [][] dizi4 = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0 ; i<2 ;i++){
            
            for(int j = 0 ; j<2 ; j++){
                
                System.out.println("İndex " + (i)+(j));
                dizi4[i][j] = scanner.nextInt();
            }
        }
        System.out.println("******************************");
         for(int i = 0 ; i<2 ;i++){
            for(int j = 0 ; j<2 ; j++){
                
                System.out.print(dizi4[i][j] + " ");
            }
             System.out.println("");
        }
    }
}
