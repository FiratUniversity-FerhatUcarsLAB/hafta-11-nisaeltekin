 * Ad Soyad: [Nisanur Eltekin]
 * Ogrenci No: [250541100]
 * Tarih: [02/12/2025]
 * Aciklama: Gorev 6

public class Exercise4_6_Multadd {

   public class Multadd {

    // a * b + c ifadesini hesaplar 
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // x * e^(-x) + sqrt(1 - e^(-x)) ifadesini hesaplar
    public static double expSum(double x) {
        double expNegX = Math.exp(-x); // e^(-x)
        return multadd(x, expNegX, Math.sqrt(1 - expNegX));
    }

    public static void main(String[] args) {
        // Basit multadd testleri
        System.out.println("Test 1: " + multadd(2, 3, 4));   // 2*3+4 = 10
        System.out.println("Test 2: " + multadd(1.5, 2, 0)); // 1.5*2+0 = 3.0
        System.out.println("Test 3: " + multadd(5, -1, 7));  // 5*(-1)+7 = 2

        // sin(π/4) + cos(π/4)/2
        double expr1 = multadd(1.0, Math.sin(Math.PI/4), Math.cos(Math.PI/4)/2);
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + expr1);

        // log(10) + log(20)
        double expr2 = multadd(1.0, Math.log(10), Math.log(20));
        System.out.println("log(10) + log(20) = " + expr2);

        // x * e^(-x) + sqrt(1 - e^(-x)) ifadesi için örnek: x = 2
        double expr3 = expSum(2.0);
        System.out.println("expSum(2.0) = " + expr3);
    }
}

}
