import java.util.ArrayList;
import java.util.List;
import Exercice1.Exercice1;
import Exercice2.Exercice2;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<String> list = new ArrayList<>();
        //ajout des elements a la liste
        list.add("avoir");
        list.add("pierre");
        list.add("courrir");
        list.add("marcher");
        list.add("avo");
        
        System.out.println(Exercice1.search(list));

        //Exercice2
        List<Integer> listInteger = new ArrayList<>();
        //ajout des elements a la liste
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        System.out.println(Exercice2.getString(listInteger));


    }
}
