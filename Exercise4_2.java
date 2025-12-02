 * Ad Soyad: [Nisanur Eltekin]
 * Ogrenci No: [250541100]
 * Tarih: [02/12/2025]
 * Aciklama: Gorev 2

public class Exercise4_2 {

  // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) { //1
        zippo("rattle", 13); //2
    }

    public static void baffle(String blimp) { //7
        System.out.println(blimp); //8
        zippo("ping", -5); //9
    }

    public static void zippo(String quince, int flag) { //3, 10
        if (flag < 0) { //11
            System.out.println(quince + " zoop"); //12
        } else { //4
            System.out.println("ik"); //5
            baffle(quince); //6
            System.out.println("boo-wa-ha-ha"); //13
        }
    }
}

/** Cevaplar
*2- baffle ilk cagirildiginda blimp'in degeri rattle'dir.
*3- Cikti
ik
rattle
ping zoop
boo-wa-ha-ha
*4- 19.satir (zippo metodu) birden fazla kez cagirilmistir.
*/
