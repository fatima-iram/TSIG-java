import java.util.*;

class Duplicate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int s = 0;

        // Validate array size input
        if (sc.hasNextInt()) {
            s = sc.nextInt();
            if (s <= 0) {
                System.out.println("Invalid size. Exiting.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Invalid input. Exiting.");
            sc.close();
            return;
        }

        int arr[] = new int[s];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < s; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            } else {
                System.out.println("Invalid input. Exiting.");
                sc.close();
                return;
            }
        }

      
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                // Only add to duplicates list if it's not already in it
                if (!duplicates.contains(num)) {
                    duplicates.add(num);
                }
            } else {
                seen.add(num);
            }
        }

        // Print the list of duplicates
        if (!duplicates.isEmpty()) {
            System.out.println("Duplicate elements: " + duplicates);
        } else {
            System.out.println("No duplicate elements found.");
        }

        sc.close();
    }
}
