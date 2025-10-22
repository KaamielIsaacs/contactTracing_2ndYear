import java.util.*;

public class contactTracing {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("How many pairs of baby: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number of babies.");
                return;
            }
            int numBabies = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            int[][] babyTimes = new int[numBabies][2];

            List<String> numberOfPairs = new ArrayList<>();


            for (int i = 0; i < numBabies; i++) {
                System.out.print("Enter time of arrival (i) and time of departure (j) for baby, eg: i,j: ");
                String input = scanner.nextLine().trim();
                String[] times = input.split(",");

                if (times.length != 2) {
                    System.out.println("Invalid input format. Please enter the times in the format i,j.");
                    i--; // Decrement i to repeat this iteration
                    continue;
                }
                try {
                    babyTimes[i][0] = Integer.parseInt(times[0].trim());
                    babyTimes[i][1] = Integer.parseInt(times[1].trim());
                    
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter valid integers for arrival and departure times.");
                    i--; // Decrement i to repeat this iteration
                }
            }
            
            for (int i = 0; i < numBabies; i++) {
                int a_i = babyTimes[i][0];
                int d_i = babyTimes[i][1];

                for (int j = i + 1; j < numBabies; j++) {
                    int a_j = babyTimes[j][0];
                    int d_j = babyTimes[j][1];
            

                    if (a_i < d_j && a_j < d_i) {
                        numberOfPairs.add("(" + (i+1) + "," + (j+1) + ")");
                }
            }
        }


            if (numberOfPairs.isEmpty()) {
                System.out.println("There are no babies present at the creche at the same time.");
            } else {
                System.out.println("The distinct pairs of babies who are at the crèche simultaneously are");
                for (String pair : numberOfPairs) {
                    System.out.println(pair + "");
                }

            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.err.println("An error occurred: " + e.getMessage());

        }

    }

}
