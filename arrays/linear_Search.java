import java.util.Scanner;

public class linear_Search {
    public static void main(String[] args) {
        int size,i,num;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array");
        size =sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of array");
        for(i= 0; i<size;i++) {
            arr[i]=sc.nextInt();
        }
        for (i= 0;i<size; i++) {
            System.out.println("element of arreys is:"+arr[i]);
        }
        System.out.println("enter the search no:");
        num=sc.nextInt();
        for(i=0;i<size;i++) {
            if(arr[i]==num){
            System.out.println("searching no. is: "+arr[i]+" and on the index"+i);
        }}

    }
}

