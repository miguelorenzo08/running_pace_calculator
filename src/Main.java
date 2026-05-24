import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== RUNNING PACE CALCULATOR ===");

        System.out.print("Introduce la distancia en km: ");
        double distance = scanner.nextDouble();

        System.out.print("Introduce el tiempo en minutos: ");
        double time = scanner.nextDouble();

        double pace = time / distance;
        double speed = distance / (time / 60);

        int paceMinutes = (int) pace;
        int paceSeconds = (int) ((pace - paceMinutes) * 60);

        System.out.println("\n=== RESULTADOS ===");
        System.out.printf("Ritmo: %d:%02d min/km%n", paceMinutes, paceSeconds);
        System.out.printf("Velocidad media: %.2f km/h%n", speed);

        scanner.close();
    }
}