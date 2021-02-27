class Main 
{
  public static void main(String[] args) 
  {
    Square box = new Square();
    box.side = 3;
    //square.setAtt(box.side);
    box.setAtt();
    
    System.out.println("The square's side length is: " + box.side);
    System.out.println("The square's diagonal length is: " + box.diagonal);
    System.out.println("The square's perimeter length is: " + box.perimeter);
    System.out.println("The square's area length is: " + box.area);
    
  }
  
}

public class Square{
  
  public double side, diagonal, perimeter, area;
 
 public void setAtt(){
  
  this.diagonal = (this.side*Math.sqrt(2));
  this.perimeter = this.side*4;
  this.area = Math.pow(this.side,2);
}
}
/*
public class Square
{
	public double side;
	public double diagonal;
	public double perimeter;
	public double area;
	public void setAtt()
	{
		this.diagonal = this.side * Math.sqrt(2);
		this.perimeter = this.side*4;
		this.area = Math.pow(this.side, 2);
	}
}
*/
