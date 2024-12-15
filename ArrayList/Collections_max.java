import java.util.ArrayList;
import java.util.Collections;
public class Collections_max {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(3);
        numbers.add(18);

        // Find the maximum element in the list
        int maxValue = Collections.max(numbers);

        System.out.println("Maximum Value: " + maxValue);  // Output: Maximum Value: 25
    }
}

