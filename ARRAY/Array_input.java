import java.util.*;
public class Array_input {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
      for(int i=0;i<arr.length;i++){
        System.out.println("enter the elements :");
        arr[i]=sc.nextInt();
      }
      for(int i=0;i<arr.length;i++){
        System.out.println("element of dynamic array as input :"+arr[i]);
      }
        sc.close();
    }
}
