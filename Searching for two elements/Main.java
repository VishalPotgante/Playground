import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
       int arr[] = new int[size];
      int count1= -1;
      int count2 = -1;
      for(int index = 0; index<size;index++)
          {
            arr[index] = in.nextInt();
          }
      
      int sr1 = in.nextInt();
      int sr2 = in.nextInt();
      
      for(int index=0;index<size;index++)
      {
         if(arr[index]==sr1)
           count1 = index;
        else if(arr[index]==sr2)
          count2 = index;
      }
      
      System.out.println(count1);
      System.out.println(count2);
      
    }
}