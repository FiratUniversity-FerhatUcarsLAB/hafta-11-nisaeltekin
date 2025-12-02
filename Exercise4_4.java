 * Ad Soyad: [Nisanur Eltekin]
 * Ogrenci No: [250541100]
 * Tarih: [02/12/2025]
 * Aciklama: Gorev 4

public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
        //return değerini kullanmazsak hata olmaz, sadece boşa gitmiş olur.
        
        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        //bu bir void metodu olduğundan dolayı hiçbir değer döndürmez. +7 yazarsak java hata verir 
        çünkü + değeri toplamak ister ama println hiçbir değer döndürmediği için ortada değer yoktur.

        // Cevaplarinizi yorum olarak ekleyin.
    }
}
