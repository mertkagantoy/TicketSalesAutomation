public class Film extends Urun {
    private String tur;

    public Film(String ad, int stok, String tur) {
        super(ad, stok);
        this.tur = tur;
    }

    public String getTur() {
        return tur;
    }

    @Override
    public void satisYap(int miktar) {
        if (getStok() >= miktar) {
            System.out.println(miktar + " bilet satildi.");
            setStok(getStok() - miktar);
        } else {
            System.out.println("Maalesef yeterli bilet yok.");
        }
    }


}