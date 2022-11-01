import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

class Clock {
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_RESET = "\u001B[0m";
  public static void main(String[] args) {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
    LocalDateTime now = LocalDateTime.now();
    System.out.printf("The current " + ANSI_RED + "time " + ANSI_RESET + "is %s \n", dtf.format(now));
  }
}
