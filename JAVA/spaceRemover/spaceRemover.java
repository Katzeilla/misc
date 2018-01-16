class spaceRemove {
  public static void main(String[] args) {
    String line = args[0];
    char[] line_char = line.toCharArray();
    for (int x = 0; x < line_char.length; x++) {
      char now = line_char[x];
      if (now != ' ') {
        System.out.print(now);
      } else {
        System.out.print(".");
      }
    }
  }
}
