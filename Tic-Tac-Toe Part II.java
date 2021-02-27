import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    char[][] chart = new char[3][3];
    int count = 1, userchoice, banana = 9;
    Scanner readin = new Scanner(System.in);
    
    chart[0][0] = '1';
    chart[0][1] = '2';
    chart[0][2] = '3';
    chart[1][0] = '4';
    chart[1][1] = '5';
    chart[1][2] = '6';
    chart[2][0] = '7';
    chart[2][1] = '8';
    chart[2][2] = '9';
    
        printGrid(chart);
    
    for(int i = 0; i < banana; i++){
      
      if(count%2==0){
        System.out.print("Which number would you like to replace with an 'O'?");
        userchoice = readin.nextInt();
        switch(userchoice){
          
          case 1:
            if(chart[0][0]!='O'&&chart[0][0]!='X'){
            chart[0][0] = 'O';
            }else{
              System.out.println("Don't try to cheat! Try again:");
              banana++;
            }
            break;
          case 2:
            if(chart[0][1]!='O'&&chart[0][1]!='X'){
            chart[0][1] = 'O';
            }else{
              System.out.println("Don't try to cheat! Try again:");
              banana++;
            }
            break;
          case 3:
            if(chart[0][2]!='O'&&chart[0][2]!='X'){
            chart[0][2] = 'O';
            }else{
              System.out.println("Don't try to cheat! Try again:");
              banana++;
            }
            break;
          case 4:
            if(chart[1][0]!='O'&&chart[1][0]!='X'){
            chart[1][0] = 'O';
            }else{
              System.out.println("Don't try to cheat! Try again:");
              banana++;
            }
            break;
          case 5:
            if(chart[1][1]!='O'&&chart[1][1]!='X'){
            chart[1][1] = 'O';
            }else{
              System.out.println("Don't try to cheat! Try again:");
              banana++;
            }
            break;
          case 6:
            if(chart[1][2]!='O'&&chart[1][2]!='X'){
            chart[1][2] = 'O';
            }else{
              System.out.println("Don't try to cheat! Try again:");
              banana++;
            }
            break;
          case 7:
            if(chart[2][0]!='O'&&chart[2][0]!='X'){
            chart[2][0] = 'O';
            }else{
              System.out.println("Don't try to cheat! Try again:");
              banana++;
            }
            break;
          case 8:
            if(chart[2][1]!='O'&&chart[2][1]!='X'){
            chart[2][1] = 'O';
            }else{
              System.out.println("Don't try to cheat! Try again:");
              banana++;
            }
            break;
          case 9:
            if(chart[2][2]!='O'&&chart[2][2]!='X'){
            chart[2][2] = 'O';
            }else{
              System.out.println("Don't try to cheat! Try again:");
              banana++;
            }
            break;
          default:
          System.out.println(" ");
          break;
        }
      } else
      if(count%2!=0){
        System.out.print("Which number would you like to replace with an 'X'?");
        userchoice = readin.nextInt();
        switch(userchoice){
          
          case 1:
            if(chart[0][0]!='O'&&chart[0][0]!='X'){
            chart[0][0] = 'X';
            }else{
              System.out.println("Don't try to cheat! Try again:");
              banana++;
            }
            break;
          case 2:
            if(chart[0][1]!='O'&&chart[0][1]!='X'){
            chart[0][1] = 'X';
            }else{
              System.out.println("Don't try to cheat! Try again:");
              banana++;
            }
            break;
          case 3:
            if(chart[0][2]!='O'&&chart[0][2]!='X'){
            chart[0][2] = 'X';
            }else{
              System.out.println("Don't try to cheat! Try again:");
              banana++;
            }
            break;
          case 4:
            if(chart[1][0]!='O'&&chart[1][0]!='X'){
            chart[1][0] = 'X';
            }else{
              System.out.println("Don't try to cheat! Try again:");
              banana++;
            }
            break;
          case 5:
            if(chart[1][1]!='O'&&chart[1][1]!='X'){
            chart[1][1] = 'X';
            }else{
              System.out.println("Don't try to cheat! Try again:");
              banana++;
            }
            break;
          case 6:
            if(chart[1][2]!='O'&&chart[1][2]!='X'){
            chart[1][2] = 'X';
            }else{
              System.out.println("Don't try to cheat! Try again:");
              banana++;
            }
            break;
          case 7:
            if(chart[2][0]!='O'&&chart[2][0]!='X'){
            chart[2][0] = 'X';
            }else{
              System.out.println("Don't try to cheat! Try again:");
              banana++;
            }
            break;
          case 8:
            if(chart[2][1]!='O'&&chart[2][1]!='X'){
            chart[2][1] = 'X';
            }else{
              System.out.println("Don't try to cheat! Try again:");
              banana++;
            }
            break;
          case 9:
            if(chart[2][2]!='O'&&chart[2][12]!='X'){
            chart[2][2] = 'X';
            }else{
              System.out.println("Don't try to cheat! Try again:");
              banana++;
            }
            break;
          default:
          System.out.println(" ");
          break;
        }
      }
      
      printGrid(chart);
      count++;
    }
    
  }
  
  public static void printGrid(char grid[][])
  {
    
    for(int i = 0; i < grid.length; i++){
      for(int j = 0; j < grid[i].length; j++){
        
        System.out.print(grid[i][j] + " ");
        
      }
          System.out.println();
    }
  }
}
