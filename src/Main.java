public class Main {
    public static void main(String[] args) {
        UserInteractionHandler userInteractionHandler = new UserInteractionHandler();
        userInteractionHandler.start();
    }
}

/*
    Todos - as many as you have a chance to do an feel comfortable tackling:
    1. Ability to exit the loop, now that we're using the TodoApplication class
    2. Having only 2 lines of code in "main" method:
    ToDoApplication  toDoApp = new ToDoApplication();
    toDoApp.start();
    3. Making the todos variable be an instance field
    4. Building out more menu options -> as many as you have time for:
    -Add
    -Delete
    -Toggle Done, using TodoItem class, and setting the boolean property isDone on the class instance
    -Edit
    -Quit
    4. Can you see any other classes we can create that would be good from an object-orientation perspective?
    For example: a Todo.java class, or a UserInteractionHandler.java class?
    5. Creating a GitHub user profile, and pushing this repo there.
    6. Printing out index next to todo, and then delete and edit happen by index. For example:
            0. Get bread
            1. Get eggs
            3. Get snack
 */
