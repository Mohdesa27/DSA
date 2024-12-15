import java.util.Arrays;

public class Array_copy {
    public static void main(String[] args) {
        int arr[]={4,7,2,9,5,3};
        int new_arr[]=Arrays.copyOf(arr,arr.length);
        System.out.println(new_arr);
    }
}
