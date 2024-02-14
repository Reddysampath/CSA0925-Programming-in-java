class Chararraytest {
    public static void main(String[] args) {
        String str = "i am a programmer";
        char c = 'p';
        int flag = 0; // Initialize flag to -1 to indicate not found
        
        for (int i = 0; i <=17; i++) {
            if (str.charAt(i) == c) {
                flag = i+1; // Update flag to the index where the character is found
                break;
            }
        }

        if (flag == 0) {
            System.out.println("The character " + c + " is not present in the string.");
        } else {
            System.out.println("The character " + c + " is present at index " + flag);
        }
    }
}
