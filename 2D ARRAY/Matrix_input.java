import java.util.*;
public class Matrix_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no. of rows : ");
        int r=sc.nextInt();
        System.out.print("enter the no. of columns : ");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("enter the elements of matrix : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print("enter element ["+i+"]["+j+"] :");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
