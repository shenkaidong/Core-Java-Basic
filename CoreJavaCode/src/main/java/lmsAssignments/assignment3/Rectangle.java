package lmsAssignments.assignment3;

public class Rectangle extends Shape {
    private float x;
    private float y;

    public Rectangle(float x, float y) {
        this.x = x;
        this.y = y;
        CalArea();
    }


    @Override
    protected void CalArea() {
        this.area = x*y;
    }

}
