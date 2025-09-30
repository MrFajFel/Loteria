import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Los los1 = new Los(5,10);
        Los los2 = new Los(20,20);
        Los los3 = new Los(150,30);
        Los los4 = new Los(200,1);
        Los los5 = new Los(300,100);
        Los los6 = new Los(500,90);
        Los los7 = new Los(1234,80);
        ArrayList<Los> losy = new ArrayList<>();

        losy.add(los1);
        losy.add(los2);
        losy.add(los3);
        losy.add(los4);
        losy.add(los5);
        losy.add(los6);
        losy.add(los7);

        Loteria loteria = new Loteria(losy);

        loteria.losyZwycieskie(losy);
        for(Los los : loteria.pulaNagrod){
            los.czyWygralem();
        }
    }
}