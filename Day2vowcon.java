import java.util.*;
class Day2vowcon
 {
    public static void main(String arg[])  
{
        String Str = "Engineering";

        String vowels = "";
        String consonants = "";
        char ch;
        Str = Str.toLowerCase();
        int n = Str.length();
        for (int i = 0; i < n; i++) 
   {
            ch = Str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')  
           {
                vowels += ch + " ";
                
            } else if (ch >= 'a' && ch <= 'z')
            {
                consonants += ch + " ";
                
            }
    }
       
        System.out.println("Vowels: " + vowels);
        
        System.out.println("Consonants: " + consonants);
       
    }
}
