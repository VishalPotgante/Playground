import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    for(int starCount=1;starCount<=num;starCount++)
    {
       System.out.println("*");
    }
  }
}