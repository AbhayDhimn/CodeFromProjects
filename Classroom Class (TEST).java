class Main 
{
  public static void main(String[] args)
  {
    Classroom Class = new Classroom();
    
  Class.roomnum = 114;
  Class.numdesk = 24;
  Class.numstudent = 24;
  Class.maxoccupancy = 30;
  Class.period = 3;
  Class.teachername = "Giordano";
  Class.subject = "Java";
    
    printClassroomInfo(Class);
    
  }
  
  public static void printClassroomInfo(Classroom Class)
  {
    
    System.out.println("Room Number: " + Class.roomnum);
    System.out.println("Number of Desks: " + Class.numdesk);
    System.out.println("Number of Students: " + Class.numstudent);
    System.out.println("Max Occupancy: " + Class.maxoccupancy);
    System.out.println("Period: " + Class.period);
    System.out.println("Teacher Name: " + Class.teachername);
    System.out.println("Subject: " + Class.subject);
    
  }
}


public class Classroom
{
  public int roomnum, numdesk, numstudent, maxoccupancy, period;
  public String teachername, subject;
  
}
