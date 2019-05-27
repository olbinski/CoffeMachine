package Logic.Components;

public class Frother implements Devices, Heaters {

    private int toClean = 10;

    @Override
    public boolean clean() {

        toClean = 10;

        return false;
    }

    @Override
    public boolean run() throws Exception {

        heat();

        //Making foam
        System.out.println("*Making foam");



        return false;
    }

    @Override
    public boolean heat() throws Exception{
        if(toClean <= 0)
            throw new MyException("Frother need cleaning");
        System.out.println("*Heating milk");
        toClean -- ;

        return true;
    }
}
