import java.util.*;
public class SubArray_possible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Input the size of the array
        int n = scanner.nextInt();
        
        // Step 2: Input the array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int negativeSubarrayCount = 0;
        
        // Step 3: Iterate through all possible subarrays
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum < 0) {
                    negativeSubarrayCount++;
                }
            }
        }
        
        // Step 4: Output the result
        System.out.println(negativeSubarrayCount);
        
        scanner.close();
} 
}
