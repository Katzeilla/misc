import java.util.*;

class gradeArray {
  public static void main(String[] args) {
    int[][] grade = { {98, 92, 99}, {81, 82, 91}, {91, 92, 91} };
    for (int x = 0; x < grade.length; x++) {
     for (int y = 0; y < grade[x].length; y++) {
       System.out.println("Student " + x + " " + grade[x][y]);
     }
    int score = (grade[x][0] + grade[x][1] + grade[x][2]) / 3;
      System.out.println(score);
    }
  }
}
