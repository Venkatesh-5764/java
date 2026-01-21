import java.util.*;

class Todo {

    String name;
    int id;

    HashMap<String, String> taskList = new HashMap<>();


    public Todo(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void addTask(String taskName, String status) {
        taskList.put(taskName, status);
        System.out.println("Task added successfully.");
    }

    public void viewTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("Your Tasks:");
        for (Map.Entry<String, String> entry : taskList.entrySet()) {
            System.out.println("Task: " + entry.getKey()
                    + " | Status: " + entry.getValue());
        }
    }
}

public class TODOLIST {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // user details
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your ID:");
        int id = sc.nextInt();

        Todo todo = new Todo(name, id);

        while (true) {

            System.out.println("\n====== TODO MENU ======");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter task name: ");
                    String taskName = sc.nextLine();

                    System.out.print("Enter status (Pending/Done): ");
                    String status = sc.nextLine();

                    todo.addTask(taskName, status);
                    break;

                case 2:
                    todo.viewTasks();
                    break;

                case 3:
                    System.out.println("Thank you for using TODO App 😊");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
