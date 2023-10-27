package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {

    void run(Scanner scanner) {
        System.out.println("Podaj współrzedną X");
        int x = scanner.nextInt();
        System.out.println("Podaj współrzędną Y");
        int y = scanner.nextInt();
        Point point = new Point(x, y);
        System.out.println(viewPoint(point));
    }

    String viewPoint(Point point) {
        if ((point.x == 0) && (point.y == 0)) {
            return point + " leży na środku układu współrzędnych";
        } else if ((point.x == 0) && (point.y != 0)) {
            return point + " leży na osi Y";
        } else if ((point.x != 0) && (point.y == 0)) {
            return point + " leży na osi X";
        } else if ((point.x > 0) && (point.y > 0)) {
            return point + " leży w I ćwiartce układu współrzędnych";
        } else if ((point.x > 0) && (point.y < 0)) {
            return point + " leży w IV ćwiartce układu współrzędnych";
        } else if ((point.x < 0) && (point.y < 0)) {
            return point + " leży w III ćwiartce układu współrzędnych";
        } else {
            return point + " leży w II ćwiartce układu współrzędnych";
        }
    }
}
