class Credits {
  public static void main(String[] args) {
    // set up film information
    String title = "The Piano";
    int year = 1993;
    String director = "Jane Campion";
    String role1 = "Ada";
    String actor1 = "Holly Hunter";
    String role2 = "Baines";
    String actor2 = "HK";
    String role3 = "S";
    String actor3 = "SN";
    String role4 = "F";
    String actor4 = "AP";

    // display information
    System.out.println(title + " (" + year + ")\n" + 
        "A " + director + " film.\n\n" + 
        role1 + "\t" + actor1 + "\n" +
        role2 + "\t" + actor2 + "\n" +
        role3 + "\t" + actor3 + "\n" +
        role4 + "\t" + actor4);
    
  }
}
