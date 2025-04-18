import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {
    static ArrayList<String> tasks = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            if (choice == 1) {
                addTask();
            } else if (choice == 2) {
                viewTasks();
            } else if (choice == 3) {
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    static void addTask() {
        System.out.print("Enter task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added.");
    }

    static void viewTasks() {
        System.out.println("\nYour Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}
