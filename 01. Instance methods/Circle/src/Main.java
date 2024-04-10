import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner scanner=new Scanner(System.in);
        circle.radius= scanner.nextDouble();
        circle.getLength();
        circle.getArea();
    }
}
