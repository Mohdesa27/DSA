import java.util.Arrays;
public class Array_reverse {
    public static void main(String[] args) {
        int arr[]={5,7,3,8};
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.print("{");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println("}");
        System.out.println(Arrays.toString(arr));
    }
}
