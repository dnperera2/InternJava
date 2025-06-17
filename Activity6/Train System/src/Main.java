import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stations = new ArrayList<>();
        stations.add("colombo");
        stations.add("gampaha");
        stations.add("kurunegala");
        stations.add("kandy");
        stations.add("matale");

        Scanner scanner = new Scanner(System.in);

        // Display all stations
        System.out.println("Available stations:");
        for (String station : stations) {
            System.out.println("- " + station);
        }

        String start, end;
        int sIndex, dIndex;

        while (true) {
            // Get valid starting station
            while (true) {
                System.out.print("Enter Your Starting Station: ");
                start = scanner.next().toLowerCase().trim();
                if (stations.contains(start)) {
                    break;
                }
                System.out.println("This station is not available!");
            }

            // Get valid destination station
            while (true) {
                System.out.print("Enter Your Destination Station: ");
                end = scanner.next().toLowerCase().trim();
                if (stations.contains(end)) {
                    break;
                }
                System.out.println("This station is not available!");
            }

            sIndex = stations.indexOf(start);
            dIndex = stations.indexOf(end);

            if (dIndex < sIndex) {
                System.out.println("We cannot complete this travel path (destination comes before start). Try again.\n");
            } else {
                break;
            }
        }

        // Print train journey
        System.out.println("\nTrain journey from " + start + " to " + end + ":");
        for (int i = sIndex; i <= dIndex; i++) {
            System.out.println("Train at: " + stations.get(i));
        }

        scanner.close();
    }
}
