 * Ad Soyad: [Nisanur Eltekin]
 * Ogrenci No: [250541100]
 * Tarih: [02/12/2025]
 * Aciklama: Gorev 1 


public class v1 {

    // Amerikan formatı: Monday, July 22, 2019
    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println("Amerikan Formatı:");
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    // Avrupa formatı: 22 July 2019, Monday
    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println("Avrupa Formatı:");
        System.out.println(date + " " + month + " " + year + ", " + day);
    }

    public static void main(String[] args) {
        String day = "Monday";
        String month = "July";
        int date = 22;
        int year = 2019;

        printAmerican(day, date, month, year);
        printEuropean(day, date, month, year);
    }
}

