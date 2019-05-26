import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int arr[] = new int[size];
    for(int index=0;index<size;index++)
      arr[index] = in.nextInt();
    
    int largest = 0;
    int c= 0;
    
    for(int i=0 ;i<size;i++)
    {
       if(arr[i]>largest)
       {
         largest = arr[i];
         c = i;
       }
      
    }
   System.out.println(c);
  }
}