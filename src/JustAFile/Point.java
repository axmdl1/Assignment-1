package JustAFile;

public class Point {
    private double x;
    private double y;

    // constructor having both parameters
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    // getDistance(Point dest) - calculate the distance from current point to dest point
    public double getDistance(Point dest) {
        double x2 = dest.getX() - getX();
        double y2 = dest.getY() - getY();

        return Math.sqrt(x2*x2 + y2*y2);
    }
}
