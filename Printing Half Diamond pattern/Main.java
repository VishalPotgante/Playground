import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
       for(int row=1;row<=n;row++)
       {
         for(int spaces=1;spaces<=n-row;spaces++)
           System.out.print(" ");
         
         for(int col=1;col<=2*(row)-1;col++)
           System.out.print("*");
         System.out.println();
       }
	}
}