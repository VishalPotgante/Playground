import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      prime(n);
	}
  public static void prime(int a)
  { int count =0;
    for(int i=2;i<=a;i++)
    {
      if(a==2)
        System.out.println(a);
      else 
      {
         for(int j=2;j<=i/2;j++)
         {
           if(i%j==0)
             count++;
         }
        if(count==0)
          System.out.println(i);
      }
      count = 0;
    }
  }
}