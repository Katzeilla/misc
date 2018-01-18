public class DslModem extends Modem {
  String method = "DSL Phone connection";

  public void connect() {
    System.out.println("Connecting to Internet ...");
    System.out.println("Using a " + method);
  }
}
