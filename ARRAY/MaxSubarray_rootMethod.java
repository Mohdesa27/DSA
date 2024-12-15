import java.util.*;
public class MaxSubarray_rootMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int cursum=0;
            for(int j=i;j<n;j++){
                cursum+=arr[j];
                maxsum=Math.max(cursum,maxsum);
            }
        }
        System.out.println(maxsum);
        sc.close();
    }
}
