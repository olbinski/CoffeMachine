package Logic.Components;

public class Brewer implements Devices, Heaters {

    int toClean = 15;

    @Override
    public boolean clean() {
        return false;
    }



    @Override
    public boolean heat() throws Exception {
        if(toClean <= 0)
            throw new MyException("Brewer need cleaning");

        //magic
        System.out.println("*Heating water");
        toClean --;
        return true;
    }


    @Override
    public boolean run() throws Exception {

        heat();

        System.out.println("*Brewing coffee");


        return false;
    }

}
