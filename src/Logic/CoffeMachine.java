package Logic;

import Logic.Coffee.CoffeeName;
import Logic.Coffee.Recipe;
import Logic.Components.*;
import Logic.Containers.Cointainer;
import Logic.Containers.ContainersName;

import java.util.HashMap;
import java.util.Map;

public class CoffeMachine {


    private Map<CoffeeName, Recipe> recipes = new HashMap<>();
    private Map<DevicesName, Devices> devices = new HashMap<>();
    private Map<ContainersName, Cointainer> containers = new HashMap<>();

    public CoffeMachine() {
        recipes.put(CoffeeName.ESPRESSO, new Recipe(40, 80, 0, 0));
        recipes.put(CoffeeName.HOT_WATER, new Recipe(0, 200, 0, 0));
        recipes.put(CoffeeName.CAPUCCINO, new Recipe(40, 70, 70, 70));
        recipes.put(CoffeeName.LATE, new Recipe(40, 70, 110, 30));

        devices.put(DevicesName.Brewer, new Brewer());
        devices.put(DevicesName.Grinder, new Grinder());
        devices.put(DevicesName.Frother, new Frother());


        containers.put(ContainersName.COFFEE, new Cointainer(1000));
        containers.put(ContainersName.WATER, new Cointainer(2000));
        containers.put(ContainersName.MILK, new Cointainer(1000));
    }


    public boolean makeCoffee(CoffeeName coffeeName) throws Exception {
        Recipe currentRecipe = recipes.get(coffeeName);


        // take coffee and grind it
        if (currentRecipe.getCoffeeAmount() != 0) {
            if (!containers.get(ContainersName.COFFEE).get(currentRecipe.getCoffeeAmount())) {
                throw new MyException("Coffee container is empty.");
            }

            devices.get(DevicesName.Grinder).run();
        }


        //take water and brew coffee
        if (currentRecipe.getWaterAmount() != 0) {
            if (!containers.get(ContainersName.WATER).get(currentRecipe.getWaterAmount())) {
                throw new MyException("Water container is empty.");
            }
            devices.get(DevicesName.Brewer).run();
        }


        //take milk and heat it
        if (currentRecipe.getMilkAmount() != 0) {
            if (!containers.get(ContainersName.MILK).get(currentRecipe.getMilkAmount())) {
                throw new MyException("Milk container is empty.");
            }
            ((Frother) devices.get(DevicesName.Frother)).heat();
        }


        //take milk and make foam
        if (currentRecipe.getFoamAmount() != 0) {
            if (!containers.get(ContainersName.MILK).get(currentRecipe.getFoamAmount())) {
                throw new MyException("MIlk container is empty.");
            }
            devices.get(DevicesName.Frother).run();
        }


        return true;

    }

    public boolean clean(DevicesName deviceName) {

        devices.get(deviceName).clean();
        return true;
    }

    public boolean refillContainer(ContainersName containerName) {
        containers.get(containerName).refill();

        return true;

    }
}
