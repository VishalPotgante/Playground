import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int arr[] = new int[26];
        for(int idx=0;idx<26;idx++)
        {
          arr[idx] = 0;
        }
      for(int idx=0;idx<sb.length();idx++)
        {
           if(sb.charAt(idx)>='a' && sb.charAt(idx)<='z')
           {
              int offset = sb.charAt(idx)-'a';
               arr[offset]++;         
           }
          
           if(sb.charAt(idx)>='A' && sb.charAt(idx)<='Z')
           {
              int offset = sb.charAt(idx)-'A';
               arr[offset]++;         
           }
          
        }
           for(int idx=0;idx<26;idx++)
           {
              if(arr[idx]==0)
              {
                char ch = (char)('a' + idx);
                System.out.print(ch+" ");
              } 
           }
    }
}