import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      
      int arr[] = new int[arr_size];
      
      for(int index=0;index<arr_size;index++)
      {
         arr[index] = in.nextInt();
      }
      
      for(int index=0;index<arr_size;index++)
      {
        if(arr[index]!=0)
          System.out.print(arr[index]+" ");
      }
      
       for(int index=0;index<arr_size;index++)
      {
        if(arr[index]==0)
          System.out.print(arr[index]+" ");
      }
    }
}