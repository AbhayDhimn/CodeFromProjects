import java.util.Scanner;
import java.io.File;

class Main 
{
  public static void main(String[] args)  //throws Exception
  {
    Scanner readin = new Scanner(System.in);
    //File stalk = new File("Students.txt");
   // Scanner fileread = new Scanner(stalk);
    int peeps;
    
    System.out.print("Enter the number of students: ");
    peeps = readin.nextInt();
    
    Student students[] = new Student[peeps];
    
    readin.nextLine();
    for(int d = 0; d < peeps; d++){
      Student bob = new Student();
      System.out.println("Enter student name: ");
      bob.Name = readin.nextLine();
      System.out.println("Enter student ID number: ");
      bob.ID = readin.nextLine();
      System.out.println("Enter the student's grade: ");
      bob.grade = readin.nextLine();
      System.out.println("Enter the student's homeroom number: ");
      bob.HR = readin.nextLine();
    
      students[d] = bob;
    }
    for(int d = 0; d < peeps; d++){
      //students[d] = bob;
    System.out.print(students[d].Name+" "+students[d].ID+" "+students[d].grade+"-"+students[d].HR);
    }
  }
}


public class Student{
  
  public String Name;
  public String ID, grade, HR;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}


Text for input file "Students.txt" :

Black, James
324761
12
8
Ford, Robert
102945
11
6
Gold, Kevin
934216
10
5
Holmes, Tyler
846377
10
4
Jones, Mike
432567
12
1
Miller, David
123974
10
5
Nuno, Javier
908235
10
4
Ortega, Juan
143621
11
6
Roberts, Jane
934182
12
4
Williams, Michelle
451862
11
4
