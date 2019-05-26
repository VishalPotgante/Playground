import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       int choice = in.nextInt();
      
      switch(choice)
      {
        case 1: 
          		int side = in.nextInt();
                int area = side * side;
      	System.out.println(area);		
          break;
        case 2:
          		int length = in.nextInt();
                int breadth = in.nextInt();
                area = length * breadth;
          System.out.println(area);		
          break;
        case 3:
          		int base = in.nextInt();
          		int height = in.nextInt();
          	    int aree =  (base * height)/2;
                System.out.println(aree);		
          break;
        case 4:
          		double radius = in.nextDouble();
                double are = 3.14 * radius * radius;
                System.out.println(are);		
          break;
      
      }
      
    }
}