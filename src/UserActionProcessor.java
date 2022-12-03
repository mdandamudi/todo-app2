import java.util.List;
import java.util.Scanner;

public class UserActionProcessor {
    void processAddTodo(ToDo toDo, List<ToDoItem> todos) {
        String errand = getInputFromUser();
        toDo.add(todos, errand);
        toDo.print(todos);
    }

    private int getIndexFromUser() {
        Scanner scanner = new Scanner(System.in);
        int index;

        try {
            index = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid number.");
            return -1;
        }

        return index;
    }

    private String getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
