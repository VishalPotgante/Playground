import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      
      int arr[] = new int[arr_size];
      for(int i=0;i<arr_size;i++)
        arr[i] = in.nextInt();
      int value = in.nextInt();
      findpairs(arr,arr_size,value);
    }
  public static void findpairs(int arr[] , int arr_size,int value)
  {
     for(int index1=0;index1<arr_size;index1++)
       for(int index2=index1+1;index2<arr_size;index2++)
       {
          if((arr[index1]+arr[index2])==value)
             System.out.println(arr[index1]+", "+arr[index2]);
       
       }
  }
}