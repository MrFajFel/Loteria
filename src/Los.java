import java.util.Random;

public class Los {
    private int wartosc;
    protected int kwota;

    public Los(int kwota) {
        Random rand = new Random();
        this.wartosc = rand.nextInt(1,100);
        this.kwota = kwota;
    }

    public int getWartosc() {
        return wartosc;
    }

    public int getKwota() {
        return kwota;
    }

    public void czyWygralem(int los){
        System.out.println("nic");
    }
    @Override
    public String toString() {
        return "wartosc = " + wartosc + ", kwota = " + kwota;
    }
}
