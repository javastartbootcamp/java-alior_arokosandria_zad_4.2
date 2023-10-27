package pl.javastart.task;

public class Point {
    int x;
    int y;

    @Override
    public String toString() {
        return "Punkt (" + x + ", " + y + ")";

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
