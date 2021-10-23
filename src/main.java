import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        // when true, keeps the program running
        boolean status = true;

        while (status == true) {
            System.out.println("Welcome, please choose a task: \n 1. Sorting \n 2. Searching");
            System.out.print("Enter 1 to select Sorting and 2 to select Searching: ");
            int task = in.nextInt();

            // An array of the searching and sorting algorithms implemented
            String[] searching_algorithms = {"Linear / Sequential Search", "Binary Search"};
            String[] sorting_algorithms = {"Insertion Sort", "Selection Sort", "Quick Sort", "Shell Sort"};
            System.out.println("");

            if (task == 1) {
                System.out.println("Sorting Algorithms");

                // printing out all sorting algorithms from the array
                for (int i = 0; i < sorting_algorithms.length; i++)
                    System.out.println(i + 1 + ". " + sorting_algorithms[i]);

                // Accept user's preferred sorting algorithm
                System.out.print("Select your preferred algorithm for sorting: ");
                int alg = in.nextInt();

                String algorithm = sorting_algorithms[alg - 1];

                System.out.println("");

                // Accepting user's array size
                System.out.print("Enter the number of elements to be sorted  (array size): ");
                int num_elements = in.nextInt();
                int user_array[] = new int[num_elements];

                System.out.println("");

                // accepting user's input of array elements
                System.out.println("Enter your array elements: ");
                for (int i = 0; i < num_elements; i++) {
                    user_array[i] = in.nextInt();
                }

                // printing out the user's array
                System.out.println("Your array:\t" + Arrays.toString(user_array));

                // start a timer
                long startTime = System.nanoTime();

                // chooses algorithm to run on user's input
                if (algorithm == "Insertion Sort") {
                    int[] sorted_array = sort.insertionSort(user_array);
                    System.out.println("Sorted array:\t" + Arrays.toString(sorted_array));
                } else if (algorithm == "Selection Sort") {
                    int[] sorted_array = sort.selection_sort(user_array);
                    System.out.println("Sorted array:\t" + Arrays.toString(sorted_array));
                }
                else if (algorithm == "Quick Sort") {
                    int[] sorted_array = sort.quickSort(user_array);
                    System.out.println("Sorted array:\t" + Arrays.toString(sorted_array));
                }
                else if (algorithm == "Shell Sort") {
                    int[] sorted_array = sort.shellSort(user_array);
                    System.out.println("Sorted array:\t" + Arrays.toString(sorted_array));
                }

                // end timer
                long endTime = System.nanoTime();

                // calculates the time taken for the algorithm to run
                long totalTime = endTime - startTime;
                System.out.println("Runtime: " + totalTime + " nanoseconds.");
                System.out.println("");

            }
            else if (task == 2) {
                System.out.println("Searching Algorithms");

                // printing a numbered list of all searching algorithms from the array
                for (int i = 0; i < searching_algorithms.length; i++)
                    System.out.println(i+1 + ". " + searching_algorithms[i]);

                // Accept user's preferred searching algorithm
                System.out.print("Select your preferred algorithm for searching: ");
                int alg = in.nextInt();

                String algorithm = searching_algorithms[alg - 1];

                System.out.println("");

                // Accepting user's array size
                System.out.print("Enter the number of elements in your array (array size): ");
                int num_elements = in.nextInt();
                int user_array[] = new int[num_elements];

                System.out.println("");

                // accepting user's input of array elements
                System.out.println("Enter your array elements: ");
                for (int i = 0; i < num_elements; i++) {
                    user_array[i] = in.nextInt();
                }

                // printing out the user's array
                System.out.println("Your array:\t" + Arrays.toString(user_array));
                System.out.println("");

                // Accepting search key from user
                System.out.print("Enter search key: ");
                int search_key = in.nextInt();
                System.out.println("");

                // start a timer
                long startTime = System.nanoTime();

                // chooses algorithm to run on user's input
                if (algorithm == "Binary Search") {
                    int[] sorted_array = sort.insertionSort(user_array);
                    System.out.println("Sorted array:\t" + Arrays.toString(sorted_array));

                    int key_index = search.binary_search(sorted_array, search_key);
                    if (key_index == -1) System.out.println("Search key not found! ");
                    else System.out.println("Search key found");
                } else {
                    int key_index = search.sequential_search(user_array, search_key);
                    if (key_index == -1) System.out.println("Search key not found! ");
                    else System.out.println("Search key found at index = " + key_index);
                }

                // end timer
                long endTime = System.nanoTime();

                // calculates the time taken for the algorithm to run
                long totalTime = endTime - startTime;
                System.out.println("Runtime: " + totalTime + " nanoseconds.");
                System.out.println("");
            }


            // sets 'status' to true if the user wants to perform another task.
            System.out.println("");
            System.out.println("Would you like to perform another task?");
            System.out.print("Enter 1 to continue or 0 to exit: ");
            int another_task = in.nextInt();

            System.out.println("");

            if (another_task == 1) status = true;
            else if (another_task == 0) status = false;
            else System.out.println("Wrong choice. Bye :) ");

        }

    }
}
