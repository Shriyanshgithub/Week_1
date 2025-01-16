import java.util.*;
public class CountVowelAndConsonant{

    public static char[][] StoreVowelAndConsonant(String str){
        char[][] ch = new char[str.length()][2];
       
        for(int i=0; i<str.length(); i++){
            char alpabet = str.charAt(i);
           alpabet =   Character.toLowerCase(alpabet);

            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                ch[i][0] = str.charAt(i);
           }

             else if(str.charAt(i)>='a' && str.charAt(i) <= 'z'){
                  ch[i][1] = str.charAt(i);
             }

    }
    return ch;

  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string ");
    String str = sc.nextLine().trim();

    char[][] charcter = StoreVowelAndConsonant(str);
    System.out.println("Vowels \t Consonant");

    for(int i = 0 ; i< charcter.length; i++){
        System.out.println(charcter[i][0] + " \t" + charcter[i][1]);
        
       
    }
  }
}