import java.util.*;
public class Std_marksSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n=sc.nextInt();
        int mark[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the marks of student "+(i+1)+":");
            mark[i]=sc.nextInt();
        }
        //method 1 to find lowest and highest marks
        // Arrays.sort(mark);
        // System.out.println("Lowest marks: "+mark[0]);
        // System.out.println("Highest marks: "+mark[n-1]);
    //method 2 to find lowest and highest no
     int sum=0;
     int lowest=mark[0];
     int highest=mark[0];
     int passed=0;
     int failed=0;
     for(int i=0;i<n;i++){
        sum+=mark[i];
        if(mark[i]>highest){//find highest no
            highest=mark[i];
        }
        if(mark[i]<lowest)//find lowest no
        lowest=mark[i];
        if(mark[i]>=40)//check passed or failed
          passed++;
        else
          failed++;
    }
    double avg=(double)sum/n;//find avg
    System.out.println("Lowest marks: "+lowest);
    System.out.println("Highest marks: "+highest);
    System.out.println("Total marks: "+sum);
    System.out.println("Average marks: "+avg);
    System.out.println("Number of students passed: "+passed);
    System.out.println("Number of students failed: "+failed);
        sc.close();
    }
}
