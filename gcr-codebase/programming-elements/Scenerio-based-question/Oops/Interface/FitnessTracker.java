// 1.Build a fitness tracker: interfaces Trackable (logActivity()), Reportable
// (generateReport()), Notifiable (sendAlert()). Class FitnessDevice
// implements all three. Add a default method resetData() to Trackable.
// Demonstrate multiple interface implementation Java cannot do with
// classes.

package Interface;


interface Trackable {
    void logActivity(String activity, int calories);

    // method — only interfaces can provide default method bodies
    default void resetData() {
        System.out.println("[Trackable] All activity data has been reset.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert(String message);
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    private String deviceName;
    private int totalCalories;
    private int totalActivities;

    public FitnessDevice(String deviceName) {
        this.deviceName = deviceName;
        this.totalCalories = 0;
        this.totalActivities = 0;
    }

    @Override
    public void logActivity(String activity, int calories) {
        totalCalories += calories;
        totalActivities++;
        System.out.println("[Trackable] Activity logged: " + activity +" | Calories burned: " + calories);
    }

    @Override
    public void generateReport() {
        System.out.println("\n[Reportable] ── Fitness Report for: " + deviceName + " ──");
        System.out.println("  Total Activities  : " + totalActivities);
        System.out.println("  Total Calories    : " + totalCalories + " kcal");
        System.out.println("────────────────────────────────────────");
    }

    @Override
    public void sendAlert(String message) {
        System.out.println("[Notifiable] 🔔 ALERT → " + message);
    }
}


public class FitnessTracker {
    public static void main(String[] args) {
        System.out.println("FITNESS TRACKER DEMO");

        FitnessDevice device = new FitnessDevice("SmartBand Pro");

        device.logActivity("Morning Run", 350);
        device.logActivity("Cycling", 500);
        device.logActivity("Yoga", 200);

        device.sendAlert("You've burned over 1000 calories today! Great job!");

        device.generateReport();

        device.resetData();

        System.out.println("\n── Why classes can't do this ──");
        System.out.println("Java does NOT allow: class A extends B, C");
        System.out.println("But Java ALLOWS   : class A implements B, C, D ...");
        System.out.println("This avoids the 'Diamond Problem' of multiple inheritance.");
    }
}
