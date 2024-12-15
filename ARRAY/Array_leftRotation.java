import java.util.Scanner;
public class Array_leftRotation {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=arr[(i+d)%n];
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(arr1[i]+" ");
                }
                sc.close();
                }
                
}

