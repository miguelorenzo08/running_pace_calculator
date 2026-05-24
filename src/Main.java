import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== RUNNING PACE CALCULATOR ===");

        System.out.print("Introduce la distancia en km: ");
        double distance = scanner.nextDouble();

        System.out.print("Horas: ");
        int hours = scanner.nextInt();

        System.out.print("Minutos: ");
        int minutes = scanner.nextInt();

        System.out.print("Segundos: ");
        int seconds = scanner.nextInt();

        double totalTime = (hours * 60) + minutes + (seconds / 60.0);

        double pace = totalTime / distance;
        double speed = distance / (totalTime / 60);

        int paceMinutes = (int) pace;
        int paceSeconds = (int) ((pace - paceMinutes) * 60);

        System.out.println("\n=== RESULTADOS ===");
        System.out.printf("Ritmo: %d:%02d min/km%n", paceMinutes, paceSeconds);
        System.out.printf("Velocidad media: %.2f km/h%n", speed);

        scanner.close();
    }
}