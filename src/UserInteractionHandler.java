import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInteractionHandler {
    private static final String ADD = "Add";
    private static final String DELETE = "Delete";
    private static final String DONE = "Mark Done";
    private static final String EDIT = "Edit";
    private static final String QUIT = "Quit";
    private static final String PRINT = "Print";

    public enum Action {
        ADD,
        DELETE,
        DONE,
        EDIT,
        QUIT
    }

    public void start() {
        ToDo toDo = new ToDo();
        UserActionProcessor userActionProcessor = new UserActionProcessor();
        List<String> listOfActions = List.of(
                ADD,
                DELETE,
                DONE,
                EDIT,
                QUIT
        );
//        new ArrayList<>();
//        listOfActions.add(ADD);
//        listOfActions.add(DELETE);
//        listOfActions.add(DONE);
//        listOfActions.add(EDIT);
//        listOfActions.add(QUIT);

        System.out.println("Application started");
        for (String action : listOfActions) {
            System.out.println(action);
        }

        List<ToDoItem> todos = new ArrayList<>(); // polymorphism
        String value;

//        var blah = "hi";

        while (true) {
            System.out.println("Choose any action(Add,Edit,Delete,Mark Done,Print,Quit):");
            value = getInputFromUser();
            if (value.equalsIgnoreCase(ADD)) {
                System.out.println("Enter an errand to add:");
                userActionProcessor.processAddTodo(toDo, todos);
            } else if (value.equalsIgnoreCase(DELETE)) {
                System.out.println("Enter an index to delete:");
                int index = getIndexFromUser();
                if (index >= 0) {
                    toDo.delete(todos, index);
                    toDo.print(todos);
                }
            } else if (value.equalsIgnoreCase(DONE)) {
                System.out.println("Enter an index to update:");
                int index = getIndexFromUser();
                if (index >= 0) {
                    toDo.markDone(todos, index);
                    toDo.print(todos);
                } // TODO - notify user if bad index (<0)
            } else if (value.equalsIgnoreCase(EDIT)) {
                System.out.println("Enter an index to update:");
                int index = getIndexFromUser();
                if (index >= 0) {
                    System.out.println("Enter an errand to replace with:");
                    String updatedAction = getInputFromUser();
                    toDo.edit(todos, index, updatedAction);
                    toDo.print(todos);
                }
            } else if (value.equalsIgnoreCase(PRINT)) {
                toDo.print(todos);
            } else if (value.equalsIgnoreCase(QUIT)) {
                break;
            } else {
                System.out.println("Invalid Action. Please choose a valid action(Add,Edit,Delete,Mark Done,Quit)");
            }
        }
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