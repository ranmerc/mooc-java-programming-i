import java.util.ArrayList;

public class PointList {
    
    private ArrayList<Point> points;

    public PointList() {
        this.points = new ArrayList<>();
    }
    
    public void addPoint(int value) {
        if (value >= 0 && value <= 100) {
            Point point = new Point(value);
            this.points.add(point);
        }
    }
    
    public double pointAverageAll() {
        if (points.isEmpty()) {
            return -1;
        }
        
        int sum = 0;
        
        for (Point point : this.points) {
            sum += point.getValue();
        }
        
        return (double) sum / this.points.size();
    }
    
    public double pointAveragePassing() {
        int count = 0;
        int sum = 0;
        
        for (Point point : this.points) {
            if (point.getValue() >= 50) {
                count++;
                sum += point.getValue();
            }
        }
        
        if (count == 0) {
            return -1;
        }
        
        return (double) sum / count;
    }
    
    public double passPercentage() {
        int count = 0;
        
        for (Point point : this.points) {
            if (point.getValue() >= 50) {
                count++;
            }
        }
        
        if (count == 0) {
            return 0;
        }
        
        return (double) 100 * count / points.size();
    }
    
    public int pointsWithGrade(int grade) {
        int count = 0;
        
        for (Point point : this.points) {
            if (point.getGrade() == grade) {
                count++;
            }
        }
        
        return count;
    }
}
