package Logic.Containers;

import Logic.Components.MyException;

public class Cointainer {
    protected double capacity;
    protected double currentAmount;

    public Cointainer(double Capacity){
        this.capacity = Capacity;
        this.currentAmount = 0;
    }

     public boolean get(double Amount){

        if(Amount > currentAmount)
            return false;

        currentAmount -= Amount;
        return true;
     };
     public boolean refill(){
        currentAmount = capacity;

         return true;
     };

    
}
