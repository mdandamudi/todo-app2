import java.util.List;

public class ToDo {
    // public, private, package private, protected
    public void add(List<ToDoItem> todos, String item) {
        ToDoItem newItem = new ToDoItem(item, false);
        todos.add(newItem);
        System.out.println(item + " is added to the list");
    }

    public void print(List<ToDoItem> todos) {
        int index = 0;
        System.out.println("*** ToDo list contents ***");
        for (ToDoItem todo : todos) {
            System.out.println((index++) + "." + todo.getText());
        }
    }

    public void delete(List<ToDoItem> todos, int index) {
        try {
            String removedItem = todos.get(index).getText();
            todos.remove(index);
            System.out.println(removedItem + "is removed from the list");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index not found");
        }
    }

    public void markDone(List<ToDoItem> todos, int index) {
        try {
            todos.get(index).setDone(true);
            System.out.println(todos.get(index).getText() + " is completed");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index not found");
        }
    }

    public void edit(List<ToDoItem> todos, int index, String updatedItem) {
        try {
            todos.get(index).setText(updatedItem);
            todos.get(index).setDone(false);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index not found");
        }
    }
}
