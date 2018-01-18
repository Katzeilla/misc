public class AcousticModem extends Modem {
  String method = "AcousticModem";

  public void connect() {
    System.out.println("Connecting to Internet using " + method + "...");
  }
}
