public class ModemTester {
  public static void main(String[] args) {
    DslModem oldmodem = new DslModem();
    CableModem newmodem = new CableModem();
    AcousticModem acmodem = new AcousticModem();

    oldmodem.speed = 20000;
    newmodem.speed = 500000;
    acmodem.speed = 1000;

    System.out.println("Testing DslModem:");
    oldmodem.displaySpeed();
    oldmodem.connect();
    oldmodem.disconnect();

    System.out.println("Testing CableModem:");
    newmodem.displaySpeed();
    newmodem.connect();
    newmodem.disconnect();

    System.out.println("Testing AcousticModem");
    acmodem.displaySpeed();
    acmodem.connect();
    acmodem.disconnect();
  }
}
