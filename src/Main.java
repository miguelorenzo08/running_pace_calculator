import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== RUNNING PACE CALCULATOR ===");

        System.out.print("Introduce la distancia en km: ");
        String inputDistance = scanner.next().replace(",", ".");
        double distance = Double.parseDouble(inputDistance);
        if (distance <= 0) {
            System.out.println("La distancia debe ser mayor que 0.");
            return;
        }
        System.out.print("Horas: ");
        int hours = scanner.nextInt();

        System.out.print("Minutos: ");
        int minutes = scanner.nextInt();
        if (minutes < 0 || minutes > 59) {
            System.out.println("Los minutos deben estar entre 0 y 59.");
            return;
        }
        System.out.print("Segundos: ");
        int seconds = scanner.nextInt();
        if (seconds < 0 || seconds > 59) {
            System.out.println("Los segundos deben estar entre 0 y 59.");
            return;
        }
        double totalTime = (hours * 60) + minutes + (seconds / 60.0);

        double pace = PaceCalculator.calculatePace(totalTime, distance);
        double speed = PaceCalculator.calculateSpeed(totalTime, distance);

        int paceMinutes = (int) pace;
        int paceSeconds = (int) ((pace - paceMinutes) * 60);

        System.out.println("\n=== RESULTADOS ===");
        System.out.printf("Ritmo: %d:%02d min/km%n", paceMinutes, paceSeconds);
        System.out.printf("Velocidad media: %.2f km/h%n", speed);

        scanner.close();
    }
}