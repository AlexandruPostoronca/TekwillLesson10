import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        car.make = scanner.next();
        car.yearModel = scanner.nextInt();
        car.speed = scanner.nextInt();

        car.accelerate();

        car.brake();


    }
}
