import java.util.Scanner;

public class Max {
    public static void main(String[] args) {    
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
        }
        int max=arr[0];
        for(int j=1;j<n;j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        System.out.println(max);
    }
    sc.close();
  }  
}
