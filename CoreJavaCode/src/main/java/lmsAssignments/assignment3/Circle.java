package lmsAssignments.assignment3;

public class Circle extends Shape {
    private float r;

    public Circle(float r) {
        this.r = r;
        CalArea();
    }


    @Override
    protected void CalArea() {
        this.area = (float) (3.14 * r*r);
    }


}
