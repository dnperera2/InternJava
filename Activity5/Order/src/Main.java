import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //We use Arraylist since it dynamically extend according to inputs and
        //Collection class helps in sorting
        ArrayList<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String inp;

        while(true){
            System.out.println("Enter Name (to quit press q)");
            inp = sc.next();

            if(inp.toLowerCase().equals("q")){
                break;
            }
            else{
                arr.add(inp);
            }
        }

        Collections.sort(arr);

        for (String s : arr){
            System.out.println(s);
        }


    }
}