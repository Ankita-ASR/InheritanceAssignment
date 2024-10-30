import java.awt.Point;

public class LabeledPointT {
    private Point point;
    private String label;

    public LabeledPointT(int x, int y, String label) {
        this.point = new Point(x, y);
        this.label = label;
    }
    public String toString() {
        return point.toString() + " - " + label;
    }
}
