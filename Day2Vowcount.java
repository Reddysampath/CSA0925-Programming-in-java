import java.util.*;
class Day2vowcount
{
    public static void main(String arg[])  
   {
        String Str = "Saveetha School of Engineering";
        int vowelcount = 0;
        String vowels = "";
        String consonants = "";
        char ch;
        Str = Str.toLowerCase();
        int n = Str.length();
        for (int i = 0; i < n; i++) {
            ch = Str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            {
                vowels += ch + " ";
                vowelcount++;
            } else if (ch >= 'a' && ch <= 'z')
            {
                consonants += ch + " ";
               
            }
        }
       
        System.out.println("No. of vowels: " + vowelcount);
        
    }
}
