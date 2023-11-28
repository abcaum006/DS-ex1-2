import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Foot foot;
        int choice;

        System.out.println("What to draw? 1. Ellipse, 2. Rectangle");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                foot = new Ellipse();
                break;
            case 2:
                foot = new Rectangle();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        foot.draw();
    }
}