
import java.util.ArrayList;
/**
 *
 * @author Ibrahim Ali Metin
 */
public class Main {
    
    public static void main(String[] args) {
        
        /*
        İlkel Veri Tipleri:
        ----------------------
        boolean -> Boolean // boolean 'a karşılık gelen wrapper class
        char -> Character
        short -> Short
        int -> Integer
        float -> Float
        double -> Double
        ----------------------
        */
        
        ArrayList<String> arraylist = new ArrayList<String>();
        
        //ArrayList<int> arrayList2 = new ArrayList<int>(); // int ilkel bir veri tipi olduğu için java bize hata veriyor. Referans gönderilmesi gerekirken biz ilkel veri tipi int verdik!
        
        //Integer a = 1; //int 'ı sınıf olarak tanımladık (Wrapper Class) 
        
        ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
        
        /*for(int i = 0 ; i < 10 ; i ++){
            
            arraylist2.add(Integer.valueOf(i*5)); 
            // Autoboxing, ilkel veri tipi olan i yi kutuya alıp bunu wrapper class olarak arraylist'e atıyoruz. 
        }
        
        for (int i = 0 ; i < arraylist2.size() ; i++){
            System.out.println(arraylist2.get(i).intValue()); 
            // Integer referansı aldık onun içindeki int value almak istediğimizi belirtiyoruz bu işlemde Unboxing 'dir !
        }*/
        
        //JAVA AUTOBOXING VE UNBOXING ISLEMLERINI OTOMATİK OLARAK YAPMAKTADIR!!!! Aşağıdaki şekilde görüldüğü gibi:
        for(int i = 0 ; i < 10 ; i ++){
            
            arraylist2.add(i*5); 
        }
        
        for (int i = 0 ; i < arraylist2.size() ; i++){
            System.out.println(arraylist2.get(i)); 
        }
    }
}
