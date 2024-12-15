import java.util.*;
public class Sum_medianArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        int[] arr = new int[n];
        int arr1[]=new int[m];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        int comb[]=new int[n+m];
        for(int i=0;i<n;i++){
            comb[i]=arr[i];
        }
        for(int i=0;i<m;i++){
            comb[i+n]=arr1[i];
        }
        Arrays.sort(comb);
        for(int i=0;i<n+m;i++){
             int sum=(n+m)/2;
            System.out.println(sum);

            sc.close();
    }
}
}
