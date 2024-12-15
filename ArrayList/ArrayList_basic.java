import java.util.ArrayList;
/**
 * ArrayList_basic
 */
public class ArrayList_basic {

    public static void main(String[] args) {
        ArrayList<String> as=new ArrayList<>();
    System.out.println("Add the items: ");//ADD
        as.add("Raja");
        as.add(1,"Rani");
        as.add("weds");
        as.add("java");
        as.add("is");
        as.add("fun");
        System.out.println(as);
    System.out.println("Remove the items: ");//REMOVE
        as.remove(5);
        as.remove("is");
        System.out.println(as);
    System.out.println("Get the items: ");//GET
        String name=as.get(3);
        System.out.println(name);
    System.out.println("Set the items: ");
        as.set(3, "arrangment");//replace
        System.out.println(as);
    System.out.println("Size of the arraylist: ");//SIZE
        System.out.println(as.size());
    System.out.println("Contains the item: ");//CONTAIN
        System.out.println(as.contains("java"));
    System.out.println("Clear the arraylist: ");//CLEAR
        as.clear();
        System.out.println(as);
    System.out.println("Check the list is empty or not: ");//ISEMPTY
        System.out.println(as.isEmpty());
    

    }
}