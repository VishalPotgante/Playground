import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int temp = num;
      int sum = 0;
      int fact=1;
      while(num > 0)
      {
        int rem = num%10;
        for(int i=1;i<=rem;i++)
        {
          fact = fact * i;
        }
        sum = sum + fact;
        fact=1;
        num = num/10;
      }
     
      if(temp==sum)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}