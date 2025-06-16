import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FreqMap {

    public static void main(String[] args) {

        // we want the insertion order we can go with Linked HashMap

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.nextLine();

        input = input.toLowerCase();
        char[] inputs = input.toCharArray();

        HashMap<Character, Integer> hs = new LinkedHashMap<>();

        for(Character c : inputs){
            if(!c.equals(' ')) {
                hs.put(c, hs.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> item : hs.entrySet()){
            System.out.println(item.getKey() +": " + item.getValue());
        }


    }
}
