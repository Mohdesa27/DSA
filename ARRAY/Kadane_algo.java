import java.util.*;
public class Kadane_algo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int cursum=0;
        for(int i=0;i<n;i++){
            cursum+=arr[i];
            maxsum=Math.max(maxsum,cursum);
            if(cursum<0){
                cursum=0;
            }
        }
        System.out.println(maxsum);
        sc.close();
    }
}