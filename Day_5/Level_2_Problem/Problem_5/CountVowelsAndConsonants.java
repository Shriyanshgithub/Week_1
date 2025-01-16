import java.util.Scanner;

public class CountVowelsAndConsonants {

     Method to check if the character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
         Convert character to lowercase if it's uppercase
        ch = Character.toLowerCase(ch);
        
         Check if the character is a vowel
        if (ch == 'a'  ch == 'e'  ch == 'i'  ch == 'o'  ch == 'u') {
            return Vowel;
        }
         Check if the character is a consonant (letter but not vowel)
        else if (ch = 'a' && ch = 'z') {
            return Consonant;
        } 
         If it's not a letter
        else {
            return Not a Letter;
        }
    }

     Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

         Loop through each character in the string
        for (int i = 0; i  str.length(); i++) {
            char ch = str.charAt(i);

             Call checkCharacterType method to determine the type of character
            String result = checkCharacterType(ch);
            
             Increment the corresponding count based on the result
            if (result.equals(Vowel)) {
                vowelCount++;
            } else if (result.equals(Consonant)) {
                consonantCount++;
            }
        }

         Return the counts in an array [vowelCount, consonantCount]
        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
         Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

         Prompt the user for input
        System.out.println(Enter a string );
        String inputStr = sc.nextLine().trim();

         Call the method to count vowels and consonants
        int[] counts = countVowelsAndConsonants(inputStr);

         Display the result
        System.out.println(Vowels  + counts[0]);
        System.out.println(Consonants  + counts[1]);

         Close the scanner to prevent resource leak
        sc.close();
    }
}
