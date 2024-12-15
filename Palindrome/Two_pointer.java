import java.util.Scanner;
public class Two_pointer{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter string: ");
        String str=sc.nextLine();
        int l=0;
        int r=str.length()-1;
        boolean ispali=true;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r))
            ispali=false;
        l++;
        r--;
        }
        if(ispali)
        System.out.println("Palindrome");
        else
        System.out.println("not Palindrome");
        sc.close();
    }
    
}