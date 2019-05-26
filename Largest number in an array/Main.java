import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      int largest = 0;
      for(int index=0;index<size;index++)
      {
        arr[index] = in.nextInt();
        if(arr[index]>largest)
          largest  = arr[index];
      }
      System.out.println(largest);
      
    }
}