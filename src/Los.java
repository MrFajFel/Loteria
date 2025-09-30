import java.util.Random;

public class Los {
    private int wartosc;
    protected int kwota;
    private boolean wygrana;

    public Los(int kwota,int wartosc) {
        Random rand = new Random();
        this.wartosc = wartosc;
        this.kwota = kwota;
    }

    public int getWartosc() {
        return wartosc;
    }

    public void setWygrana(boolean wygrana) {
        this.wygrana = wygrana;
    }

    public void czyWygralem(){
        if (wygrana ){
            System.out.println("Los z numerem: " + wartosc + " Wygral: " +  kwota*2);
        }
        else {
            System.out.println("Los z numerem " + wartosc + " Nie wygrales");
        }
    }

    @Override
    public String toString() {
        return "wartosc = " + wartosc + ", kwota = " + kwota;
    }
}
