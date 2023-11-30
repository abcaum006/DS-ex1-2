import java.util.Scanner;

public class Foot {
    FootShape fs = new FootShape();

    public void draw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
        int input = sc.nextInt();
        if (input == 1) System.out.println(fs.drawAsEllipse());
        else if (input == 2) System.out.println(fs.drawAsRectangle());
        sc.close();
    }
}
