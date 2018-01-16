class Food {
  public static void main(String[] args) {
    String food = "Fish";
    String food_upper = food.toUpperCase();
    String guess = args[0].toUpperCase();
    System.out.println(food_upper.equals(guess));
  }
}
