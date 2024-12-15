import java.util.Arrays;
public class Array_searchMethod {
    public static void main(String[] args) {
        int arr[]={4,8,4,9,3,2};
        Arrays.sort(arr);
        int n=Arrays.binarySearch(arr,9);
        System.out.println(n);

        int[] arr1 = {1, 2, 3, 4, 5};
int index = Arrays.binarySearch(arr1, 3); // Searches for 3 in sorted array
System.out.println(index); // Outputs the index of 3 (2)

    }
}
