package lmsAssignments.threadingAssignmentOneLaneBridge;

public class OneLaneBridge {
    public static void main(String[] args) {
        Object vehicle1 = new Object();
        Object vehicle2 = new Object();

        EastBound td1 = new EastBound(vehicle1, vehicle2);
        td1.start();
        WestBound td2 = new WestBound(vehicle1, vehicle2);
        td2.start();
    }
}
