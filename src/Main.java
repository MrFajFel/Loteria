import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Los los1 = new Los(5);
        Los los2 = new Los(20);
        Los los3 = new Los(50);
        ArrayList<Los> losy = new ArrayList<>();

        losy.add(los1);
        losy.add(los2);
        losy.add(los3);

        Loteria loteria = new Loteria(losy);

        loteria.losyZwycieskie(losy);


    }
}