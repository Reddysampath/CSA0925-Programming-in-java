import java.util.*;

 class RemoveVowels 
{
    public static void main(String arg[])
     {
        char ch;
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        str=str.toLowerCase();
        String str2 = "";
        for ( i = 0; i < 20; i++) 
            {
             ch = str.charAt(i);
            if (ch != 'a' && ch != 'e'&& ch != 'i' && ch != 'o' && ch != 'u')
                {
                    str2 += ch;
                }
            }
        
        System.out.println("The string without vowels is: " + str2);
    }
}