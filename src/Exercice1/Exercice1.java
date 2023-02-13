package Exercice1;

import java.util.List;
import java.util.stream.Collectors;

public class Exercice1 {
    
    public static List<String> search(List<String> list) {

        List<String> result = list.stream().filter(el-> el.startsWith("a") && el.length()==3).
        collect(Collectors.toList());
        return result;
    }
}
