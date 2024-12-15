import java.util.ArrayList;
public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);

        // Remove all even numbers from the list
        //removeIf() is a method use to remove item base on condition
        s.removeIf(n -> n % 2 == 0);//use lamda expression

        // Print the modified list
        System.out.println(s);  // Output: [1, 3, 5]
    }
}
