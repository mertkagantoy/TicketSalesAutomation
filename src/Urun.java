public abstract class Urun {

    private String ad;
    private int stok;

    public Urun(String ad, int stok) {
        this.ad = ad;
        this.stok = stok;
    }

    public String getAd() {
        return ad;
    }


    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    public abstract void satisYap(int miktar);
}
