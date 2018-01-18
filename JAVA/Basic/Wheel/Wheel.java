import java.util.*;

class Wheel {
  public static void main(String[] args) {
    String[] phrase = {
    "JUST DO IT",
    "DONT EAT SNOW",
    "FEED YOUR CAT ON TIME",
    "I WANT MY CAT",
    "PLAY IT AGAIN"
    };
    int[] letterCount = new int[26];
    for (int x = 0; x < phrase.length; x++) {
      String current = phrase[x];
      char[] letter = current.toCharArray();
      for (int y = 0; y < letter.length; y++) {
        char lett = letter[y];
        if (( lett >= 'A' ) & ( lett <= 'Z' )) {
          letterCount[lett - 'A']++ ;
        }
      }
    }
    for (char count = 'A'; count <= 'Z'; count++) {
      System.out.print(count + ": " +
          letterCount[count - 'A'] + 
          " ");
    }
    System.out.println();
  }

}
