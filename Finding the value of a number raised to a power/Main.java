import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        long base = in.nextInt();
        long exponent = in.nextInt();
        long temp = 1;
      while(exponent!=0)
      {  
         exponent--;
         temp = temp * base;
        
      }
      System.out.println(temp);
    }
}