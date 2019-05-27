package Logic.Components;

public class Grinder implements Devices {

int toClean = 10;

    @Override
    public boolean clean() {

        // here do magic stuff to clean Grinder
        toClean = 10;
        System.out.println("Cleaning grinder");


        return true;
    }

    @Override
    public boolean run() throws Exception {

        if(toClean <= 0  )
            throw new MyException("Grinder need to clean.");
        System.out.println("*Grinding coffee");
        toClean--;

        return false;
    }
}
