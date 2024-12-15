import java.util.Arrays;
public class Array_MoveZero {
    public static void main(String[] args) {
        int arr[]={3,0,6,9,0,4,0};
        int n=arr.length;
        int move=0;
        for(int i=0;i<n;i++){
             if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[move];
                arr[move]=temp;
                move++;
             }
        }
        System.out.println(Arrays.toString(arr));

    }
}
