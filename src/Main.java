import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sinemaIsletmesi sinema = new sinemaIsletmesi();
        sinema.urunEkle(new Film("Çok Aşk", 5, "Romantik-Komedi"));
        sinema.urunEkle(new Film("Kara Bela", 3, "Macera"));
        sinema.urunEkle(new Film("Cadı", 10, "Korku"));
        sinema.urunEkle(new Film("Sarı Kız",13, "Doğa ve Hayvanlar"));
        sinema.urunEkle((new Film("Yazılımcı Tavuklar", 8, "Bilişim")));
        sinema.urunEkle(new Film("Kendimi Buldum",11, "Kişisel Gelişim"));

        //System.out.println(new Film("Çok Aşk", 5, "Romantik-Komedi").getTur());


        Scanner scanner = new Scanner(System.in);

        System.out.println("Filmler:");
        sinema.urunStokGoruntule(0);

        System.out.println("Hangi filmi izlemek istersiniz? (Numara girin)");
        int filmSecim = scanner.nextInt();

        System.out.println("Kaç bilet istersiniz?");
        int biletSayisi = scanner.nextInt();

        sinema.urunSatis(filmSecim, biletSayisi);
        sinema.urunStokGoruntule(biletSayisi);

        scanner.close();
    }
}