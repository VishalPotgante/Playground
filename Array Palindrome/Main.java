import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      int temp[] = new int[arr_size];
      for(int idx=0;idx<arr_size;idx++)
      {
          arr[idx] = in.nextInt();
      }
      for(int idx=arr_size-1;idx>=0;idx--)
      {
         temp[idx] = arr[(arr_size-1)-idx];
      }
      int count=0;
    for(int idx=0;idx<arr_size;idx++)
    {
       if(arr[idx]!=temp[idx])
         count++;
    }
      if(count==0)
      {
         System.out.println("Yes");
      }
      else
        System.out.println("No");
    }
}