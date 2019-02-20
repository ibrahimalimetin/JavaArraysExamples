
import java.util.ArrayList;

/**
 *
 * @author Ibrahim Ali Metin
 */
public class Main {
    
    public static void yaz(ArrayList<String> x) {
        
        for (int i = 0 ; i < x.size() ; i++){
            
            System.out.println("Eleman " + (i+1) + " :" + x.get(i) );
        }
    }
    
    public static void main(String[] args) {
        //Arraylistler, Arraylerin genişletilebilir halidir. 
        
        ArrayList<String> arraylist = new ArrayList<String>();
        
        arraylist.add("Honda"); //1. İndex
        arraylist.add("BMW"); //2. İndex
        arraylist.add("Peugeot");// 3. İndex
        arraylist.add("Audi"); //4. İndex
        arraylist.add("BMW");
        
        //System.out.println(arraylist.get(0));
        //System.out.println(arraylist.get(2)); //Arraylistlerin indexleridir. 
        
        //System.out.println(arraylist.size());//Arraylist 'in eleman sayısını bulma fonksiyonudur. 
        
        /*Arraylist içerisinden eleman çıkarma işlemi:
        arraylist.remove("Honda"); //Direk çıkartılacak String 'i de yazabiliriz.
        arraylist.remove(2); //Ya da direk çıkarılması istenen index 'i de. */
        
        
       /* for (int i = 0; i < arraylist.size() ; i++ ){
            System.out.println(arraylist.get(i));
        //Arraylist 'in elemanlarını tek tek bastırmak için kullanılan for döngüsü
        }*/
       /*
        System.out.println(arraylist.indexOf("BMW")); //Belirtilen elemanın hangi index 'e karşılık geldiğini bulmamızı sağlayan method
        System.out.println(arraylist.lastIndexOf("BMW")); // İlgili String 'in index 'ine sondan bakarak alıyor.
        System.out.println(arraylist.indexOf("FİAT")); //Arraylist içerisinde olmayan bir String aradığımızda -1 değerini döner. 
        
        arraylist.set(4, "FİAT");//Arraylist içerisinde ilgili index 'i güncellemeye yarar. 
        System.out.println(arraylist.get(4));
        System.out.println(arraylist.indexOf("FİAT")); //Arraylist içerisinde olmayan bir String aradığımızda -1 değerini döner. 
        */
       
        yaz(arraylist);
        
    }
}
