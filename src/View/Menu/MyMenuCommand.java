package View.Menu;

public class MyMenuCommand extends MyMenuItem{

    MyCommand command;


    public MyMenuCommand(String name, String commandName, MyCommand command) {
        super(name, commandName);
        this.command = command;
    }

    @Override
    public void run() {
        try{
            command.runCommand();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
