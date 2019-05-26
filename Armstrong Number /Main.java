import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
       int sum=0;
      int temp = num;
      for(int i=1;i<=3 ;i++)
      {
        int rem = num % 10;
        sum = sum + (rem*rem*rem);
        num = num /10;
      }
       
      if(sum==temp){
                System.out.println("Armstrong Number");
      }
     else
        System.out.println("Not a Armstrong Number");
	}
}