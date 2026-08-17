package day12.lineComparison;

public class LineComparison {

    public static void main(String[] args) {

        // Line 1
        Line line1 = new Line(2, 3, 5, 7);
        // Line 2
        Line line2 = new Line(1, 1, 4, 5);
        // UC1: Calculate length
        System.out.println("Length of Line 1: " + line1.getLength());
        System.out.println("Length of Line 2: " + line2.getLength());
        // UC2: Check equality
        if (line1.equals(line2)) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Both lines are not equal");
        }
        // UC3: Compare two lines
        int result = line1.compareTo(line2);

        if (result == 0) {
            System.out.println("Both lines are equal");
        } else if (result > 0) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Line 1 is less than Line 2");
        }
    }
}


class Line implements Comparable<Line> {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double getLength() {
        return Math.sqrt(
                Math.pow(x2 - x1, 2)
                + Math.pow(y2 - y1, 2)
        );
    }
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Line other = (Line) obj;
        return Double.compare(this.getLength(), other.getLength()) == 0;
    }
    @Override
    public int compareTo(Line other) {
        return Double.compare(this.getLength(), other.getLength());
    }
}
