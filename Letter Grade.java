import java.util.Scanner; // Calculates your letter grade based on your number of points / 100

class Main {
  public static void main(String[] args) {
    int num, tensplace, onesplace, plusminus;
    char lettergrade;
    char sign = ' ';
    Scanner readin = new Scanner(System.in);
    
    System.out.print("Enter your grade: ");
    num = (int)readin.nextDouble();
    
    tensplace = num/10;
    onesplace = num%10;
    
    switch(tensplace){
    case 10:
    case 9:
      lettergrade = 'A';
      break;
    case 8:
      lettergrade = 'B';
      break;
    case 7:
      lettergrade = 'C';
      break;
    case 6:
      if(onesplace<5)
      lettergrade = 'F';
      else
      lettergrade = 'D';
      break;
    default:
    lettergrade = 'F';
    }
    
    switch(onesplace){
    case 9:
    case 8:
    case 7:
      sign = '+';
      break;
    case 6:
    case 5:
    case 4:
    case 3:
      sign = ' ';
      break;
    case 2:
    case 1:
    case 0:
      if(tensplace==10){
        sign = ' ';
      }
      else
      sign = '-';
    }
      if (lettergrade=='F')
      sign = ' ';
      
        System.out.print("Your Grade: " + lettergrade + sign);
      
    
    
    }
      
    }
