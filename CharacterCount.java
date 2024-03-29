import java.util.*;

class CharacterCount {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int numberCount = 0;
        System.out.println("Enter characters. Enter '*' to stop:");
        char ch;
       String str = sc.nextLine();
        ch = str.charAt(0);

        while (ch != '*') {
            if (ch >= 'A' && ch <= 'Z') {
                uppercaseCount++; 
            } else if (ch >= 'a' && ch <= 'z') {
                lowercaseCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++; 
            }

            
            ch = sc.next().charAt(0);
        }

        
        System.out.println("Uppercase count: " + uppercaseCount);
        System.out.println("Lowercase count: " + lowercaseCount);
        System.out.println("Number count: " + numberCount);
}
        
}
