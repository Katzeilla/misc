class Benchmark {
  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    long endTime = startTime + 20000;
    long index = 0;
    while (true) {
      double x = index * index;
      long now = System.currentTimeMillis();
      if (now > endTime) {
        break;
      }
      index++;
    }
  System.out.printf(index + "loops/1m");
  }
}
