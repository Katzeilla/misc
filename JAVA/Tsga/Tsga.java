import java.util.*;

class Tsga {
  public static void main(String[] args) {
    int[] data = new int[400];
    System.out.println(data.length);
    
    int found = 0;
    int x = 0;
    while (found < 400) {
      if ( x % 13 == 0 ) {
        data[found] = x;
        System.out.println(x);
        found++;
      }
      x++;
    }
    }

  }
