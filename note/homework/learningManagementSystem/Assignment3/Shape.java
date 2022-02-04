package LMSAssignment.Assignment3;

import java.util.Comparator;

public abstract class Shape implements Comparable<Shape>{
    protected float area;
    protected abstract void CalArea();

    public float getArea() {
        return area;
    }
    @Override
    public int compareTo(Shape o) {
        return (int)(this.area - o.area);
    }
}
