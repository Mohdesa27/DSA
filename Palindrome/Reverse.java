import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no.:");
        int n=sc.nextInt();
        int t=n;
        int s=0,r;
        while(n>0){
        r=n%10;
        s=s*10+r;
        n=n/10;
        }
        if(t==s)
        System.out.println("palindrome");
        else
        System.out.println("not palindrome");
    sc.close();
    }

}
