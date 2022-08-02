import java.util.Scanner;


public class UserInterface {
    
    private Scanner scanner;
    private TodoList todos;

    public UserInterface( TodoList todos, Scanner scanner) {
        this.scanner = scanner;
        this.todos = todos;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("add")) {
                System.out.println("To add:");
                String taskToAdd = this.scanner.nextLine();
                
                this.todos.add(taskToAdd);
                
                continue;
            }
            
            if (command.equals("list")) {
                this.todos.print();
            }
            
            if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int toRemove = Integer.valueOf(this.scanner.nextLine());
                
                this.todos.remove(toRemove);
            }
        }
    }
}
