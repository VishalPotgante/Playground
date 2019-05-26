import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
     
     System.out.println(gcd(n1, n2));
   }
  
  public static int gcd(int a, int b)
  {
    int gc=1;
      
      int k=1;
    
      if(a>b)
      k = a;
    else
      k = b;
    
     if(b%a==0)
       return a;
    else if(a%b==0)
      return b;
    
  
    else
    {
      for(int i=2;i<=k;i++)
      {
         if((a%i==0)&&(b%i==0))
         {
          if(i>=gc)
            gc = i;
         }
      }
      return gc;
    }
  }
}