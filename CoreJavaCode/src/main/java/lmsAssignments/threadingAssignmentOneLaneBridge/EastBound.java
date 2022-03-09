package lmsAssignments.threadingAssignmentOneLaneBridge;

public class EastBound extends Thread {
    private Object vehicle1;
    private Object vehicle2;

    public EastBound(Object vehicle1, Object vehicle2) {
        this.vehicle1 = vehicle1;
        this.vehicle2 = vehicle2;
    }

    @Override
    public void run() {
        synchronized (vehicle1) {
            try {
                System.out.println("Vehicle 1 is approaching the bridge from Eastbound");
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (vehicle2) {
                try {
                    System.out.println("Vehicle 2 is approaching the bridge from Eastbound");
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                System.out.println("Vehicle 2 has passed the bridge from Eastbound");
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            System.out.println("Vehicle 1 has passed the bridge from Eastbound");
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
