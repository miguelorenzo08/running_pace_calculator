public class PaceCalculator {

    public static double calculatePace(double totalTime, double distance) {
        return totalTime / distance;
    }

    public static double calculateSpeed(double totalTime, double distance) {
        return distance / (totalTime / 60);
    }
}
