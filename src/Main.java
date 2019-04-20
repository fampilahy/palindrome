import java.util.Scanner;

public class Main {
  public static boolean isPalindrome(final String word) {
    if(word==null || word.length()<3)
        return false;

    int middlePosition = word.length()/2;

    for(int currentPosition=0; currentPosition<middlePosition; currentPosition++){
      if(word.charAt(currentPosition)!=word.charAt(word.length()-currentPosition-1))
        return false;
    }

    return true;
  }
  public static void main(String[] args) {
	  System.out.println("here");
    Scanner reader = new Scanner(System.in);
    String word = reader.nextLine();
    System.out.println(Main.isPalindrome(word));
  }
}