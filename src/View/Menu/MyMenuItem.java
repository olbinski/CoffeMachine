package View.Menu;

abstract public class MyMenuItem {

    protected String command;
    protected String name;






    public MyMenuItem(String name,String command) {
        this.command = command;
        this.name = name;
    }

    public String getCommand() {
        return command;
    }

    public String getName() {
        return name;
    }

   abstract public void run();


    public String toString(){


        return name + " (" + command + ")";
    }









}
