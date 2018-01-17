import java.util.*;

class Name {
  public static void main(String[] args) {
    String[] names =  { "LiMing", "XiaoMing", "XiaoLi", "LiHua", "XiaoHong", "XiaoZhang", "XiaoLiu" };

    System.out.println("The original order is: ");
    for (int x = 0; x < names.length; x++) {
      System.out.println(x + ":" + names[x]);
    }

    Arrays.sort(names);

    System.out.println("The new order is: ");
    for (int x = 0; x < names.length; x++) {
      System.out.println(x + ":" + names[x]);
    }
  }
}
