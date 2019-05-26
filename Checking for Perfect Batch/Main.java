import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    
    int arr[] = new int[size];
    
    for(int i=0;i<size;i++)
      arr[i] = in.nextInt();
 
    check_batch(arr,size);
  }
  
  public static void check_batch(int list[], int size)
  {
     int sum=0;
    for(int index=0;index<3;index++)
    {
      sum = sum + list[index];
    }
    
    int sum1=0;
      for(int index=3;index<6;index++)
    {
      sum1 = sum1 + list[index];
    }
    if((sum==sum1) && (size ==6))
      System.out.println("Perfect Batch");
    else if((sum==sum1) && (size>6))
    {  int sum2 = 0;
          for(int index=6;index<9;index++)
    {
      sum2 = sum2 + list[index];
    }
       if((sum2==sum1) && (size ==9))
      System.out.println("Perfect Batch");
     else
       System.out.println("Not a Perfect Batch");
    }
   
      else
       System.out.println("Not a Perfect Batch");
  }
}