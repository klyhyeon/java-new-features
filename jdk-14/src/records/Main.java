package records;

public class Main {

    public static void main(String[] args) {
        int length = 2;
        int width = 2;
        RectangleRecord rr = new RectangleRecord(length, width);
        rr.length();
        rr.width();

        Rectangle r = new Rectangle(length, width);
        r.length();
        r.width();
    }
}
