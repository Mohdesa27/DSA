import java.util.*;

class Search_item
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
        System.out.println("item:");
		int x=sc.nextInt();
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    if(arr[i]==x){
             System.out.println("YES");
             break;
            }
            else{
            System.out.println("NO");
            }
		}
    sc.close();
	}
}
