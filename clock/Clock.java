import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

class Clock {
  public static void main(String[] args) {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
    LocalDateTime now = LocalDateTime.now();
    System.out.printf("The current \033[0;31mtime \033[0mis %s \n", dtf.format(now));
  }
}
