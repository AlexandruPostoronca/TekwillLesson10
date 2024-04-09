import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Patient pacient = new Patient();
        pacient.name = scanner.next();
        pacient.say();
    }
}
