import java.util.ArrayList;
import java.util.Random;

public class Loteria {
    public ArrayList<Los> pulaNagrod = new ArrayList<>();
    public int zwycieskiLos;

    Random rand = new Random();


    public Loteria(ArrayList<Los> pulaNagrod) {
        this.pulaNagrod = pulaNagrod;
        this.zwycieskiLos = rand.nextInt(1,100);
    }

    public void losyZwycieskie(ArrayList<Los> pulaNagrod){
        for(int i = 0; i < pulaNagrod.size(); i++){
            if (pulaNagrod.get(i).getWartosc() == zwycieskiLos){
                pulaNagrod.get(i).setWygrana(true);
            }
            else {
                pulaNagrod.get(i).setWygrana(false);
            }
        }
        System.out.println("Zwycieski los to: " + zwycieskiLos);
    }
}
