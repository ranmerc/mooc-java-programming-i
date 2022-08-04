
public class Point {
    
    private int value;
    private int grade;

    public Point(int point) {
        this.value = point;
        
        if (point < 50) {
            this.grade = 0;
        } else if (point >= 50 && point < 60) {
            this.grade = 1;
        } else if (point >= 60 && point < 70) {
            this.grade = 2;
        } else if (point >= 70 && point < 80) {
            this.grade = 3;
        } else if (point >= 80 && point < 90) {
            this.grade = 4;
        } else if (point >= 90) {
            this.grade = 5;
        }
    }

    public int getGrade() {
        return this.grade;
    }

    public int getValue() {
        return this.value;
    }
    
    
}
