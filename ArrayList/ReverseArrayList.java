import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println(names);

        // Reversing the ArrayList
        Collections.reverse(names);

        // Printing the reversed ArrayList
        System.out.println(names);
    }
}
