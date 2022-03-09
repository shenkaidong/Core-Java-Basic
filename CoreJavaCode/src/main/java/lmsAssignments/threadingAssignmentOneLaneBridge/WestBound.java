package lmsAssignments.threadingAssignmentOneLaneBridge;

public class WestBound extends Thread {
    private Object vehicle1;
    private Object vehicle2;

    public WestBound(Object vehicle1, Object vehicle2) {
        this.vehicle1 = vehicle1;
        this.vehicle2 = vehicle2;
    }

    @Override
    public void run() {
        synchronized (vehicle1) {
            try {
                System.out.println("Vehicle 1 is approaching the bridge from WestBound");
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (vehicle2) {
                try {
                    System.out.println("Vehicle 2 is approaching the bridge from WestBound");
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                System.out.println("Vehicle 2 has passed the bridge from WestBound");
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            System.out.println("Vehicle 1 has passed the bridge from WestBound");
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
