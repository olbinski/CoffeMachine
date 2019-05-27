package Logic.Coffee;

public class Recipe {
    private double coffeeAmount;
    private double waterAmount;
    private double milkAmount;
    private double foamAmount;

    public Recipe(double coffeeAmount, double waterAmount, double milkAmount, double foamAmount) {
        this.coffeeAmount = coffeeAmount;
        this.waterAmount = waterAmount;
        this.milkAmount = milkAmount;
        this.foamAmount = foamAmount;
    }


    public double getCoffeeAmount() {
        return coffeeAmount;
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    public double getMilkAmount() {
        return milkAmount;
    }

    public double getFoamAmount() {
        return foamAmount;
    }
}
