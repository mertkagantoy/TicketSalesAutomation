import java.util.ArrayList;
import java.util.List;

public class sinemaIsletmesi {
    private List<Urun> urunListesi;

    public sinemaIsletmesi() {
        urunListesi = new ArrayList<>();
    }

    public void urunEkle(Urun urun) {
        urunListesi.add(urun);
    }

    public void urunStokGoruntule(int kalanBiletSayisi) {
        for (int i = 0; i < urunListesi.size(); i++) {
            Urun urun = urunListesi.get(i);
            System.out.println((i+1) + ". " + urun.getAd() + " - Stok: " + urun.getStok() );
        }
    }

    public void urunSatis(int urunIndex, int miktar) {
        if (urunIndex >= 1 && urunIndex <= urunListesi.size()) {
            Urun urun = urunListesi.get(urunIndex - 1);
            urun.satisYap(miktar);
        } else {
            System.out.println("Geçersiz urun numarasi.");
        }
    }
}