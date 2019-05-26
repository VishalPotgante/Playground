import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
	
       System.out.println(greatest(n1,n2,n3));
    
    }
  
  public static int greatest(int a,int b,int c)
  {
     if((a>b)&&(a>c))
       return a;
    else if((b>a)&&(b>c))
      return b;
    else
      return c;
  }
}