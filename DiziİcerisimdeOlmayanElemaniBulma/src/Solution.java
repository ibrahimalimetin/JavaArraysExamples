public class Solution {
    
public int solution(int[] A) {
    
//int[] arrTamSayilar = {0, 1, 3, 4, 5, 6, 7, 8, 9, 10};
 
//Arama isleminin sonucunu tutma
boolean isFind;
 
//for dongusuyle 0 dan n e kadar(n dahil)  tum sayilari deneyecegiz
for (int j = 0; j <= A.length; j++) {
 
//donguye ilk girildiginde degiskenimizi bulunmadi olarak ayarliyoruz
isFind = false;
 
//tum dizimizi bastan sona dolasiyoruz
for (int i = 0; i < A.length; i++) {
 
//Eger dizinin i. indexli elemani,bizim ust dongudeki j mize esitse
if (A[i] == j) {
//bulundu degiskenini true yapiyoruz
isFind = true;
}
}
//Eger degiskenimiz ic donguden false olarak cikmissa...
//.. dizide bizim kontrol ettigimiz elemana esit olan bir sayi yok demektir
if (isFind == false) {
//Bu sayiyi ekrana yaziyoruz
System.out.println("Olmayan Eleman = " + j);
 
}
}
        return 0;
 
}
 
}