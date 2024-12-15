import java.util.Scanner;
import java.util.ArrayList;
class Student{
    String name;
    int rollno;
    int marks;
    Student(String name,int rollno,int marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
    @Override
    public String toString(){
        return "Student ["+"name= "+name+", rollno="+rollno+", marks="+marks+"]";
    }
}
public class Project_ArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> st=new ArrayList<>();
        int choice;
        do{
            System.out.println("1.Add Student");
            System.out.println("2.Remove Student by Roll Number");
            System.out.println("3.Display all Students");
            System.out.println("4.Find Student with Highest Marks");
            System.out.println("5.Exit");
            choice=sc.nextInt();

            switch (choice) {
                case 1:
                System.out.println("Enter Student Name:");
                String name=sc.next();
                System.out.println("Enter Student Roll Number:");
                int rollno=sc.nextInt();
                System.out.println("Enter Student Marks:");
                int marks=sc.nextInt();
                st.add(new Student(name,rollno,marks));    
                break;

                case 2:
                System.out.println("Enter Roll Number to Remove Student:");
                int roll=sc.nextInt();
                st.removeIf(s -> s.rollno == roll);
                break;

                case 3:
                System.out.println("Students in the List:");
                for(Student s:st){
                    System.out.println(s);
                    }
                    break;

                case 4:
                Student topst=st.stream().max((s1,s2) ->s1.marks - s2.marks).orElse(null);
                System.out.println("Student with Highest Marks: "+topst);
                break;
                default:
                System.out.println("EXIT");
                    break;
            }
        }while(choice!=5);
        sc.close();
    }
}
