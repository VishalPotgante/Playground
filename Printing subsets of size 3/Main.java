import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      
      for(int index=0;index<arr_size;index++)
        arr[index] = in.nextInt();
      
      for(int i=0;i<arr_size-1;i++)
      {
        for(int j=i+1;j<arr_size-1;j++)
        {
          for(int k=j+1;k<arr_size;k++)
            System.out.print("("+arr[i]+", "+arr[j]+", "+arr[k]+") ");
        }
        System.out.println();
      }
    }
}