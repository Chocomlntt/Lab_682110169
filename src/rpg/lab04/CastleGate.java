package rpg.lab04;

public class CastleGate implements Destructible {
    private String name;
    private boolean isLocked;
    private boolean isReinforced;
    private double durability;
    private double maxDurability;
    private String status;

    public CastleGate(String name,boolean isLocked, boolean isReinforced, double maxDurability) {
        this.name=name;
        this.isLocked = isLocked;
        this.isReinforced = isReinforced;
        this.durability = maxDurability;
        this.maxDurability = maxDurability;
        this.status = "INTACT";
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean isReinforced() {
        return isReinforced;
    }

    public void setReinforced(boolean reinforced) {
        isReinforced = reinforced;
    }

    public double getDurability() {
        return durability;
    }

    public void setDurability(double durability) {
        this.durability = durability;
    }

    public double getMaxDurability() {
        return maxDurability;
    }

    public void setMaxDurability(double maxDurability) {
        this.maxDurability = maxDurability;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayGateDetails() {
    }

    @Override
    public void receiveDamage(double amount) {

    }

    @Override
    public boolean isDestroyed() {
        return false;
    }

    @Override
    public void breakOpen() {

    }
}
