import java.util.*; 
//declare the class
public class CountStringLength{
  //Method to Split the text
   public static String[] CountWord(String str){
    //create arrayList
    ArrayList<String> count = new ArrayList<>();
        int i = 0;
      for(int j = 0 ; j<str.length(); j++){
        if(str.charAt(j) == ' ' ){
           count.add(str.substring(i, j));
           i = j+1;
        }
        if( j==str.length()-1){
          count.add(str.substring(i));
        }
        if(i<str.length() && str.charAt(i) == ' '){
          i = i+1;
          j = i;
        }
       
      }
      
    //Intialize the String array
    String[] countswords = new String[count.size()];
    for(int k = 0 ; k< count.size(); k++){
      countswords[k] = count.get(k);
    }
    return countswords;
  }
    
  //Generate the method the calculate the length of word
  public static int CalculateLengthByException(String str){
    int size = 0;
    
    //Handle and catch the exception using try catch block
    try{
      //This block give StringIndexOutOfBoundsException
        for(int i=0; i<Integer.MAX_VALUE; i++){
         char ch = str.charAt(i);
         size++;
      }
    }
    catch(StringIndexOutOfBoundsException e){
          return size;
    }
    return 0;
   }


   //generate the method to put the word and its length in 2D array
  public static String[][] StoreLengthAndSubstring(String[] stringArray){
    String[][] LengthAndSubString = new String[stringArray.length][2];
    for(int i = 0; i< stringArray.length; i++){
      String words  = stringArray[i];
      String size = String.valueOf(CalculateLengthByException(words));
      LengthAndSubString[i][0]=words;
      LengthAndSubString[i][1] = size;
    }
    return LengthAndSubString;
  }

   public static int CalculateShortestLength(String[] stringArray){
    int minlength =Integer.MAX_VALUE;
    for(int i=0; i<stringArray.length; i++){
      String Word = stringArray[i];
      minlength = Math.min(minlength, Word.length());
    }
    return minlength;
   }

   public static int CalculateLongestLength(String[] stringArray){
    int min = Integer.MIN_VALUE;
    int maxlength =0;
    for(int i=0; i<stringArray.length; i++){
      String Word = stringArray[i];
      maxlength = Math.max(maxlength, Word.length());
    }
    return maxlength;
   }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine().trim();

    String[] word = CountWord(str);
    String[][] result = StoreLengthAndSubstring(word);
   
    //Display the result
    System.out.println("Word \t" + " Length \t");
    for(int i =0; i<result.length;i++){
       System.out.println(result[i][0] + "  " + result[i][1]);
    }
    int shortestLength = CalculateShortestLength(word);
    int longestLength = CalculateLongestLength(word);

    System.out.println("Shortest length of word "  + shortestLength);
    System.out.println("longest length of word "  + longestLength);
  }
 } 