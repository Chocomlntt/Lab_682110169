package rpg.lab04;

public class HealthPotion implements Consumable{
    private String name;
    private double addAmount;
    private int amount;

    public HealthPotion(String name, double addAmount, int amount) {
        this.name = name;
        this.addAmount = addAmount;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAddAmount() {
        return addAmount;
    }

    public void setAddAmount(double addAmount) {
        this.addAmount = addAmount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void displayPotionDetails() {
    }

    @Override
    public void use(Characters user) {

    }
}
