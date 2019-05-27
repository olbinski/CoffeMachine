import Logic.CoffeMachine;
import Logic.Coffee.CoffeeName;
import Logic.Components.DevicesName;
import Logic.Containers.ContainersName;
import View.Menu.MyMenuCommand;
import View.Menu.MyMenuItem;
import View.Menu.MyMenuSub;

public class App {

    private MyMenuItem mainMenu;
    private CoffeMachine coffeMachine = new CoffeMachine();


    public void makeMyMenu() {

        MyMenuSub main = new MyMenuSub("Main", "main");

        MyMenuSub makeCoffeeMenu = new MyMenuSub("Make coffee", "coffee");
        MyMenuSub serviceMenu = new MyMenuSub("Service", "service");
        MyMenuSub endMenu = new MyMenuSub("End", "back");
        MyMenuSub previousMenu = new MyMenuSub("  Previous menu", "back");

        MyMenuCommand espressoMenu = new MyMenuCommand("Espresso", "esp", () -> {
            coffeMachine.makeCoffee(CoffeeName.ESPRESSO);
            System.out.println("Your espresso is ready\n");
        });
        System.out.println("Your espresso is ready");
        MyMenuCommand latteMacchiatoMenu = new MyMenuCommand("Latte Macchiato", "latte", () -> {
            coffeMachine.makeCoffee(CoffeeName.LATE);
            System.out.println("Your latte macchiato is ready\n");
        });
        MyMenuCommand cappuccinoMenu = new MyMenuCommand("Cappuccino", "cappuccino", () -> {
            coffeMachine.makeCoffee(CoffeeName.CAPUCCINO);
            System.out.println("Your cappuccino is ready\n");


        });
        MyMenuCommand hotWaterMenu = new MyMenuCommand("Hot Water", "water", () -> {
            coffeMachine.makeCoffee(CoffeeName.HOT_WATER);
            System.out.println("Your hot water is ready\n");

        });
        MyMenuCommand refillCoffeeBeansMenu = new MyMenuCommand("Refill Coffee Container", "coffee", () -> {
            coffeMachine.refillContainer(ContainersName.COFFEE);
            System.out.println("Coffee container is full again\n");

        });
        MyMenuCommand refillWaterMenu = new MyMenuCommand("Refill Water Container", "water", () -> {
            coffeMachine.refillContainer(ContainersName.WATER);
            System.out.println("Water container is full again\n");

        });
        MyMenuCommand refillMilkMenu = new MyMenuCommand("Refill Milk Container", "milk", () -> {
            coffeMachine.refillContainer(ContainersName.MILK);
            System.out.println("Milk container is full again\n");

        });
        MyMenuCommand cleanGrinderMenu = new MyMenuCommand("Clean Grinder", "grinder", () -> {
            coffeMachine.clean(DevicesName.Grinder);
            System.out.println("Grinder container is clean again\n");

        });
        MyMenuCommand cleanFrotherMenu = new MyMenuCommand("Clean Frother", "frother", () -> {
            coffeMachine.clean(DevicesName.Frother);
            System.out.println("Frother container is clean again\n");

        });
        MyMenuCommand cleanBrewerMenu = new MyMenuCommand("Clean Brewer", "brewer", () -> {
            coffeMachine.clean(DevicesName.Brewer);
            System.out.println("Brewer container is clean again\n");

        });


        serviceMenu.addSubMenu(refillCoffeeBeansMenu);
        serviceMenu.addSubMenu(refillWaterMenu);
        serviceMenu.addSubMenu(refillMilkMenu);
        serviceMenu.addSubMenu(cleanGrinderMenu);
        serviceMenu.addSubMenu(cleanFrotherMenu);
        serviceMenu.addSubMenu(cleanBrewerMenu);
        serviceMenu.addSubMenu(previousMenu);

        makeCoffeeMenu.addSubMenu(espressoMenu);
        makeCoffeeMenu.addSubMenu(cappuccinoMenu);
        makeCoffeeMenu.addSubMenu(hotWaterMenu);
        makeCoffeeMenu.addSubMenu(latteMacchiatoMenu);
        makeCoffeeMenu.addSubMenu(previousMenu);

        main.addSubMenu(makeCoffeeMenu);
        main.addSubMenu(serviceMenu);
        main.addSubMenu(endMenu);

        mainMenu = main;


    }


    public void run() {
        mainMenu.run();
    }


}
