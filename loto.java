package kitapSonuOrnekleri;

import java.util.stream.IntStream;

public class loto {
    public static void main(String[] args) {
        System.out.println("SAYISAL LOTO ÇEKİLİŞİ");
        int[] girdi = new int[6];
        for (int i = 0; i < girdi.length; i++) {
            boolean kontrol = true; //kontrol bayrağı
            while (kontrol) {
                int sayi = sayiCek();
                /*çekilen sayı girdi dizisindeki herhangi bir sayi ile
                 * eşleşiyorsa kontrol bayrağını true yoksa falsa yap*/
                kontrol = IntStream.of(girdi).anyMatch(x -> x == sayi);

                if (!kontrol) //benzersiz sayı(kontrolbayrağı false) ise
                    girdi[i] = sayi; //sayıyı listeye ekle
            }
            System.out.println((i + 1) + " .sayı " + girdi[i]);
        }
    }//main sonu

    //sayısal loto (1-49) sayılarını üreten fonksiyon
    public static int sayiCek() {
        return (int) (1 + Math.random() * 49);
    }
}
