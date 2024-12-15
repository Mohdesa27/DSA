import java.util.Arrays;

public class Array_insertion {
    public static void main(String[] args) {
        int arr[]={10,30,40,50,60};
        int n=arr.length;
        int pos=1;
        int value=20;
        for(int i=n-1;i>pos;i--){
            arr[i]=arr[i-1];
        }
     arr[pos]=value;
     System.out.print("{");
     for(int i=0;i<n;i++){
        System.out.print(arr[i]+",");
     }
     System.out.println("}");
     System.out.println(Arrays.toString(arr));
}
}