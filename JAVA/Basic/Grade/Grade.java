class Grade {
  public static void main(String[] agrs) {
    String grade = agrs[0];
    switch (grade) {
      case "A":
        System.out.println("Good job!");
      break;
     
      case "B":
      System.out.println("Not too bad!");
      break;
      
      default:
      System.out.println("Anyway, you finished this.");
    }
    } 
}
