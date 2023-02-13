package Exercice2;

import java.util.List;

public class Exercice2 {
    
    public static String getString(List<Integer> list) {

    String value ="";
//   parcourt la liste et ajoute e devant un nombre pair et o devant un nombre impaire , de plus une virgule est ajouter entre les nombres
//el les element de list
    for (Integer el : list) {
        if (el % 2 == 0 ) {
            value += "e" +el + ",";
        } else  value += "o" +el + ",";

        
        
    }
        return value;
    }

    
}
