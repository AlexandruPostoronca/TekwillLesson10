import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box box = new Box();
        box.height = scanner.nextDouble();
        box.width = scanner.nextDouble();
        box.length = scanner.nextDouble();
        box.getVolume();
    }
}
