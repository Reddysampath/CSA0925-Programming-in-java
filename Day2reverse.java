import java.util.*;
class Day2reverse
{
  public static void main(String arg[])
    {
       String str=" Temple";  
       String rev=" ";
       char ch;
       int n=str.length();
       for(int i=n-1;i>=0;i--)
         {
            ch=str.charAt(i);
            rev=rev+ch;
          }
       System.out.println("Reverse a string:"+rev);
    }
}