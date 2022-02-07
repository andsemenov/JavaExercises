package Collection.Task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static java.util.Arrays.asList;

public class Main {
    static final String INITIAL_STRING = "Java, modern object-oriented computer programming language. Java was created at Sun Microsystems, Inc., where James Gosling led a team of researchers in an effort to create a new language that would allow consumer electronic devices to communicate with each other.";
    static ArrayList<String> allSymbolsInString = new ArrayList<>(asList(INITIAL_STRING.split("")));
    public static void main(String[] args) {
        HashSet<String> setUniqueSymbols = new HashSet<>(allSymbolsInString);
        HashMap<String, Integer> pairOfSymbolQuantity = new HashMap<String, Integer>();
        for (String symbol: setUniqueSymbols)
        {
            pairOfSymbolQuantity.put(symbol, calculateQuantity(symbol));
        }
        System.out.println("There are following quantity symbols in the string: ");
        for (String key: pairOfSymbolQuantity.keySet())
        {
            Integer value = pairOfSymbolQuantity.get(key);
            System.out.println(key + " --> " + value);
        }
    }
    private static Integer calculateQuantity(String symbol) {
        Integer counter = 0;
        for(String currentSymbol:allSymbolsInString) {
            if(currentSymbol.equals(symbol)) {
                counter++;
            }
        }
        return counter;
    }
}

//Задача 3
//Есть строка со следующим содержимым "Java, modern object-oriented computer programming language.
// Java was created at Sun Microsystems, Inc.,
// where James Gosling led a team of researchers in an effort to create a new language
// that would allow consumer electronic devices to communicate with each other."
//Подсчитать количество вхождений каждого символа в стоку(т.e. сколько раз встречается каждый символ в данной строке).
//Главное усвловие использовать Map<Key, Value>. Key - символ, Value - количество вхождений.